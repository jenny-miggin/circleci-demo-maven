package com.example.bench.mod14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen072Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen072.compute5(42), Gen072.compute5(42));
    Thread.sleep(20);
  }
}
