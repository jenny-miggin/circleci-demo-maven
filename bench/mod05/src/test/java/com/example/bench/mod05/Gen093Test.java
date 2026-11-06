package com.example.bench.mod05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen093Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen093.compute5(42), Gen093.compute5(42));
    Thread.sleep(20);
  }
}
