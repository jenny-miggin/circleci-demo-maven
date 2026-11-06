package com.example.bench.mod15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen150Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen150.compute5(42), Gen150.compute5(42));
    Thread.sleep(20);
  }
}
