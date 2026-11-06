package com.example.bench.mod10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen191Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen191.compute5(42), Gen191.compute5(42));
    Thread.sleep(20);
  }
}
