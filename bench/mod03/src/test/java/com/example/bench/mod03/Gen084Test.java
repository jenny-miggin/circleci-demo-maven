package com.example.bench.mod03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen084Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen084.compute5(42), Gen084.compute5(42));
    Thread.sleep(20);
  }
}
