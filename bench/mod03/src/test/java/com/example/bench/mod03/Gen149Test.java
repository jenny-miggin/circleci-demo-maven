package com.example.bench.mod03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen149Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen149.compute5(42), Gen149.compute5(42));
    Thread.sleep(20);
  }
}
