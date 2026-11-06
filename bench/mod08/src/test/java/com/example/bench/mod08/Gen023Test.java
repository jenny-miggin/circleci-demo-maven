package com.example.bench.mod08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen023Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen023.compute5(42), Gen023.compute5(42));
    Thread.sleep(20);
  }
}
