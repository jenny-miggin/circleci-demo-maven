package com.example.bench.mod14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen182Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen182.compute5(42), Gen182.compute5(42));
    Thread.sleep(20);
  }
}
