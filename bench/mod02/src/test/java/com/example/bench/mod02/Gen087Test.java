package com.example.bench.mod02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen087Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen087.compute5(42), Gen087.compute5(42));
    Thread.sleep(20);
  }
}
