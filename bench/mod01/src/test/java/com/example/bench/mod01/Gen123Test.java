package com.example.bench.mod01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen123Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen123.compute5(42), Gen123.compute5(42));
    Thread.sleep(20);
  }
}
