package com.example.bench.mod02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen187Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen187.compute5(42), Gen187.compute5(42));
    Thread.sleep(20);
  }
}
