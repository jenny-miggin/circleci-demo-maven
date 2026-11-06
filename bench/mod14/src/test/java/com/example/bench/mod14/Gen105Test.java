package com.example.bench.mod14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen105Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen105.compute5(42), Gen105.compute5(42));
    Thread.sleep(20);
  }
}
