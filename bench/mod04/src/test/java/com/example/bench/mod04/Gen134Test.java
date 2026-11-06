package com.example.bench.mod04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen134Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen134.compute5(42), Gen134.compute5(42));
    Thread.sleep(20);
  }
}
