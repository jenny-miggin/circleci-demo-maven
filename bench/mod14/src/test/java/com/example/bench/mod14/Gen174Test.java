package com.example.bench.mod14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen174Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen174.compute5(42), Gen174.compute5(42));
    Thread.sleep(20);
  }
}
