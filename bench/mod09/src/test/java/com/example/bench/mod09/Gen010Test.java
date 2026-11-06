package com.example.bench.mod09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen010Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen010.compute5(42), Gen010.compute5(42));
    Thread.sleep(20);
  }
}
