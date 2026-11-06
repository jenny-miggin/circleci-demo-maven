package com.example.bench.mod12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen070Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen070.compute5(42), Gen070.compute5(42));
    Thread.sleep(20);
  }
}
