package com.example.bench.mod02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen100Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen100.compute5(42), Gen100.compute5(42));
    Thread.sleep(20);
  }
}
