package com.example.bench.mod13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen138Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen138.compute5(42), Gen138.compute5(42));
    Thread.sleep(20);
  }
}
