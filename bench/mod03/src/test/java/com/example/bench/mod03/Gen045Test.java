package com.example.bench.mod03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen045Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen045.compute5(42), Gen045.compute5(42));
    Thread.sleep(20);
  }
}
