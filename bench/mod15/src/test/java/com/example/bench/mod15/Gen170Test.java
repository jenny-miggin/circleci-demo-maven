package com.example.bench.mod15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen170Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen170.compute5(42), Gen170.compute5(42));
    Thread.sleep(20);
  }
}
