package com.example.bench.mod02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen157Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen157.compute5(42), Gen157.compute5(42));
    Thread.sleep(20);
  }
}
