package com.example.bench.mod13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen197Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen197.compute5(42), Gen197.compute5(42));
    Thread.sleep(20);
  }
}
