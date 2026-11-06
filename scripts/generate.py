#!/usr/bin/env python3
"""Generate a synthetic multi-module Maven project for cache benchmarking.

Each module depends on the previous one, so a change in module N invalidates
modules N..end but leaves 0..N-1 cacheable.
"""
import pathlib
import sys

MODULES = int(sys.argv[1]) if len(sys.argv) > 1 else 12
CLASSES = int(sys.argv[2]) if len(sys.argv) > 2 else 150
ROOT = pathlib.Path(__file__).resolve().parent.parent / "bench"

GROUP = "com.example.bench"


def module_pom(i: int) -> str:
    dep = ""
    if i > 0:
        dep = f"""
    <dependency>
      <groupId>{GROUP}</groupId>
      <artifactId>mod{i - 1:02d}</artifactId>
      <version>${{project.version}}</version>
    </dependency>"""
    return f"""<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0">
  <modelVersion>4.0.0</modelVersion>
  <parent>
    <groupId>{GROUP}</groupId>
    <artifactId>bench-parent</artifactId>
    <version>1.0.0-SNAPSHOT</version>
  </parent>
  <artifactId>mod{i:02d}</artifactId>
  <dependencies>{dep}
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter</artifactId>
      <scope>test</scope>
    </dependency>
  </dependencies>
</project>
"""


def java_class(i: int, c: int) -> str:
    pkg = f"com.example.bench.mod{i:02d}"
    methods = "\n".join(
        f"""  public static long compute{m}(long x) {{
    long acc = x;
    for (int k = 0; k < {m + 3}; k++) {{ acc = (acc * 31 + k) ^ (acc >>> 7); }}
    return acc + java.util.List.of({", ".join(str(m * j) + "L" for j in range(8))}).stream().mapToLong(Long::longValue).sum();
  }}"""
        for m in range(12)
    )
    return f"""package {pkg};

public final class Gen{c:03d} {{
  private Gen{c:03d}() {{}}
{methods}
}}
"""


def java_test(i: int, c: int) -> str:
    pkg = f"com.example.bench.mod{i:02d}"
    return f"""package {pkg};

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen{c:03d}Test {{
  @Test
  void deterministic() throws Exception {{
    assertEquals(Gen{c:03d}.compute5(42), Gen{c:03d}.compute5(42));
    Thread.sleep(20);
  }}
}}
"""


def main() -> None:
    modules = "\n".join(f"    <module>mod{i:02d}</module>" for i in range(MODULES))
    (ROOT).mkdir(parents=True, exist_ok=True)
    (ROOT / "pom.xml").write_text(f"""<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0">
  <modelVersion>4.0.0</modelVersion>
  <groupId>{GROUP}</groupId>
  <artifactId>bench-parent</artifactId>
  <version>1.0.0-SNAPSHOT</version>
  <packaging>pom</packaging>
  <properties>
    <maven.compiler.release>21</maven.compiler.release>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>
  <modules>
{modules}
  </modules>
  <dependencyManagement>
    <dependencies>
      <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.11.3</version>
      </dependency>
    </dependencies>
  </dependencyManagement>
  <build>
    <pluginManagement>
      <plugins>
        <plugin><artifactId>maven-compiler-plugin</artifactId><version>3.13.0</version></plugin>
        <plugin><artifactId>maven-surefire-plugin</artifactId><version>3.5.2</version></plugin>
        <plugin><artifactId>maven-jar-plugin</artifactId><version>3.4.2</version></plugin>
        <plugin><artifactId>maven-resources-plugin</artifactId><version>3.3.1</version></plugin>
        <plugin><artifactId>maven-install-plugin</artifactId><version>3.1.3</version></plugin>
        <plugin><artifactId>maven-clean-plugin</artifactId><version>3.4.0</version></plugin>
      </plugins>
    </pluginManagement>
  </build>
</project>
""")
    for i in range(MODULES):
        mod = ROOT / f"mod{i:02d}"
        src = mod / "src/main/java/com/example/bench" / f"mod{i:02d}"
        tst = mod / "src/test/java/com/example/bench" / f"mod{i:02d}"
        src.mkdir(parents=True, exist_ok=True)
        tst.mkdir(parents=True, exist_ok=True)
        (mod / "pom.xml").write_text(module_pom(i))
        for c in range(CLASSES):
            (src / f"Gen{c:03d}.java").write_text(java_class(i, c))
            (tst / f"Gen{c:03d}Test.java").write_text(java_test(i, c))


if __name__ == "__main__":
    main()
