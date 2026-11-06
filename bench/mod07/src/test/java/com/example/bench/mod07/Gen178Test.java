package com.example.bench.mod07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen178Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen178.compute5(42), Gen178.compute5(42));
    Thread.sleep(20);
  }
}
