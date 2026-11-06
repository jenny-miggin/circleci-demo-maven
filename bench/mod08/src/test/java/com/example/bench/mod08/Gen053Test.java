package com.example.bench.mod08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen053Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen053.compute5(42), Gen053.compute5(42));
    Thread.sleep(20);
  }
}
