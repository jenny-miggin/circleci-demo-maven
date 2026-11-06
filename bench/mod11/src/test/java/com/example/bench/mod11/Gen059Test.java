package com.example.bench.mod11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen059Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen059.compute5(42), Gen059.compute5(42));
    Thread.sleep(20);
  }
}
