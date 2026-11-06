package com.example.bench.mod01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen095Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen095.compute5(42), Gen095.compute5(42));
    Thread.sleep(20);
  }
}
