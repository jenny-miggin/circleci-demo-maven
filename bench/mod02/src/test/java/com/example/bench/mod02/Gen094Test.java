package com.example.bench.mod02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen094Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen094.compute5(42), Gen094.compute5(42));
    Thread.sleep(20);
  }
}
