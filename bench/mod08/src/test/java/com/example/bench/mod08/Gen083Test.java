package com.example.bench.mod08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen083Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen083.compute5(42), Gen083.compute5(42));
    Thread.sleep(20);
  }
}
