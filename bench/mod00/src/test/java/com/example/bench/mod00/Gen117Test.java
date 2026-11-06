package com.example.bench.mod00;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen117Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen117.compute5(42), Gen117.compute5(42));
    Thread.sleep(20);
  }
}
