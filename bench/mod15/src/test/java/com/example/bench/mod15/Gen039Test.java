package com.example.bench.mod15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen039Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen039.compute5(42), Gen039.compute5(42));
    Thread.sleep(20);
  }
}
