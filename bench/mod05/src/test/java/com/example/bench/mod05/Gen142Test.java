package com.example.bench.mod05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen142Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen142.compute5(42), Gen142.compute5(42));
    Thread.sleep(20);
  }
}
