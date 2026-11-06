package com.example.bench.mod14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen032Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen032.compute5(42), Gen032.compute5(42));
    Thread.sleep(20);
  }
}
