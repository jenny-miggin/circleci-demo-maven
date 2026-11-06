package com.example.bench.mod15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen193Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen193.compute5(42), Gen193.compute5(42));
    Thread.sleep(20);
  }
}
