package com.example.bench.mod00;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen002Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen002.compute5(42), Gen002.compute5(42));
    Thread.sleep(20);
  }
}
