package com.example.bench.mod05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen092Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen092.compute5(42), Gen092.compute5(42));
    Thread.sleep(20);
  }
}
