package com.example.bench.mod08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen011Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen011.compute5(42), Gen011.compute5(42));
    Thread.sleep(20);
  }
}
