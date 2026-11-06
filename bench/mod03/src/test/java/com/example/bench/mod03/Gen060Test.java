package com.example.bench.mod03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen060Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen060.compute5(42), Gen060.compute5(42));
    Thread.sleep(20);
  }
}
