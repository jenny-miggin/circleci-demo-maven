package com.example.bench.mod02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen190Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen190.compute5(42), Gen190.compute5(42));
    Thread.sleep(20);
  }
}
