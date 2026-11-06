package com.example.bench.mod15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen156Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen156.compute5(42), Gen156.compute5(42));
    Thread.sleep(20);
  }
}
