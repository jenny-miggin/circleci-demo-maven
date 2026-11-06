package com.example.bench.mod06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen022Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen022.compute5(42), Gen022.compute5(42));
    Thread.sleep(20);
  }
}
