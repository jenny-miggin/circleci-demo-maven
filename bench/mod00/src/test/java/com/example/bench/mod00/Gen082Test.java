package com.example.bench.mod00;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen082Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen082.compute5(42), Gen082.compute5(42));
    Thread.sleep(20);
  }
}
