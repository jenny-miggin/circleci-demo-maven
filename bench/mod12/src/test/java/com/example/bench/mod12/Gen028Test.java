package com.example.bench.mod12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen028Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen028.compute5(42), Gen028.compute5(42));
    Thread.sleep(20);
  }
}
