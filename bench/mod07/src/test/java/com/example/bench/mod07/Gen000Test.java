package com.example.bench.mod07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen000Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen000.compute5(42), Gen000.compute5(42));
    Thread.sleep(20);
  }
}
