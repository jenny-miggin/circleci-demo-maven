package com.example.bench.mod11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen112Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen112.compute5(42), Gen112.compute5(42));
    Thread.sleep(20);
  }
}
