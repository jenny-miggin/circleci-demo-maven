package com.example.bench.mod11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen179Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen179.compute5(42), Gen179.compute5(42));
    Thread.sleep(20);
  }
}
