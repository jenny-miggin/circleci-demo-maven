package com.example.bench.mod11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen120Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen120.compute5(42), Gen120.compute5(42));
    Thread.sleep(20);
  }
}
