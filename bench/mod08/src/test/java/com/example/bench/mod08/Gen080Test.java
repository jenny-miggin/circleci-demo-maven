package com.example.bench.mod08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen080Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen080.compute5(42), Gen080.compute5(42));
    Thread.sleep(20);
  }
}
