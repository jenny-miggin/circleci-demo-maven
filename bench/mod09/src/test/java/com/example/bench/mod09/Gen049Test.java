package com.example.bench.mod09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen049Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen049.compute5(42), Gen049.compute5(42));
    Thread.sleep(20);
  }
}
