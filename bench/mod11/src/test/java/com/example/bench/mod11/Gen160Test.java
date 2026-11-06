package com.example.bench.mod11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen160Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen160.compute5(42), Gen160.compute5(42));
    Thread.sleep(20);
  }
}
