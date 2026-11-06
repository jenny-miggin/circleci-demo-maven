package com.example.bench.mod02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen183Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen183.compute5(42), Gen183.compute5(42));
    Thread.sleep(20);
  }
}
