package com.example.bench.mod01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen139Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen139.compute5(42), Gen139.compute5(42));
    Thread.sleep(20);
  }
}
