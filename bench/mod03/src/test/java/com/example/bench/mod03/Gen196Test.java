package com.example.bench.mod03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen196Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen196.compute5(42), Gen196.compute5(42));
    Thread.sleep(20);
  }
}
