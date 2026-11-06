package com.example.bench.mod07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen097Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen097.compute5(42), Gen097.compute5(42));
    Thread.sleep(20);
  }
}
