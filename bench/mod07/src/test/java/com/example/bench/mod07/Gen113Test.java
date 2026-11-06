package com.example.bench.mod07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen113Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen113.compute5(42), Gen113.compute5(42));
    Thread.sleep(20);
  }
}
