package com.example.bench.mod05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen018Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen018.compute5(42), Gen018.compute5(42));
    Thread.sleep(20);
  }
}
