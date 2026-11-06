package com.example.bench.mod00;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen013Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen013.compute5(42), Gen013.compute5(42));
    Thread.sleep(20);
  }
}
