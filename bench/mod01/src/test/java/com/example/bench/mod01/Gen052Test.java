package com.example.bench.mod01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen052Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen052.compute5(42), Gen052.compute5(42));
    Thread.sleep(20);
  }
}
