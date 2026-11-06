package com.example.bench.mod12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen167Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen167.compute5(42), Gen167.compute5(42));
    Thread.sleep(20);
  }
}
