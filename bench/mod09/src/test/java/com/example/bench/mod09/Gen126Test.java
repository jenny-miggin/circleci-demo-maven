package com.example.bench.mod09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen126Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen126.compute5(42), Gen126.compute5(42));
    Thread.sleep(20);
  }
}
