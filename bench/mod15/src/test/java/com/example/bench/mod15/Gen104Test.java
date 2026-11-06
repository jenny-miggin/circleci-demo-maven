package com.example.bench.mod15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen104Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen104.compute5(42), Gen104.compute5(42));
    Thread.sleep(20);
  }
}
