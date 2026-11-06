package com.example.bench.mod15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen140Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen140.compute5(42), Gen140.compute5(42));
    Thread.sleep(20);
  }
}
