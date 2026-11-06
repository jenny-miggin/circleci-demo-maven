package com.example.bench.mod12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen091Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen091.compute5(42), Gen091.compute5(42));
    Thread.sleep(20);
  }
}
