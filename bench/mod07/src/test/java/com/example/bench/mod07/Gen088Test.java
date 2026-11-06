package com.example.bench.mod07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen088Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen088.compute5(42), Gen088.compute5(42));
    Thread.sleep(20);
  }
}
