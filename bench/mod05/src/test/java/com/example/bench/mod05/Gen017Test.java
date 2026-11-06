package com.example.bench.mod05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen017Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen017.compute5(42), Gen017.compute5(42));
    Thread.sleep(20);
  }
}
