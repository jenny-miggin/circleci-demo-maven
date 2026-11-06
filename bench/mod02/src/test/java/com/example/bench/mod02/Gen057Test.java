package com.example.bench.mod02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen057Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen057.compute5(42), Gen057.compute5(42));
    Thread.sleep(20);
  }
}
