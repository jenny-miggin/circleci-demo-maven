package com.example.bench.mod13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen066Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen066.compute5(42), Gen066.compute5(42));
    Thread.sleep(20);
  }
}
