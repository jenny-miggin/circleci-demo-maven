package com.example.bench.mod09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen046Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen046.compute5(42), Gen046.compute5(42));
    Thread.sleep(20);
  }
}
