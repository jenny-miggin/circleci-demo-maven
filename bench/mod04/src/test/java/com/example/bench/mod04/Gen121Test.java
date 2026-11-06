package com.example.bench.mod04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen121Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen121.compute5(42), Gen121.compute5(42));
    Thread.sleep(20);
  }
}
