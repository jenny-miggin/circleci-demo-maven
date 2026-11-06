package com.example.bench.mod05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen173Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen173.compute5(42), Gen173.compute5(42));
    Thread.sleep(20);
  }
}
