package com.example.bench.mod06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen026Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen026.compute5(42), Gen026.compute5(42));
    Thread.sleep(20);
  }
}
