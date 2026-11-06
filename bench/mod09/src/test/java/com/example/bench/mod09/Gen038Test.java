package com.example.bench.mod09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen038Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen038.compute5(42), Gen038.compute5(42));
    Thread.sleep(20);
  }
}
