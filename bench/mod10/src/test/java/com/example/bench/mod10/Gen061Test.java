package com.example.bench.mod10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen061Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen061.compute5(42), Gen061.compute5(42));
    Thread.sleep(20);
  }
}
