package com.example.bench.mod04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen035Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen035.compute5(42), Gen035.compute5(42));
    Thread.sleep(20);
  }
}
