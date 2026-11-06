package com.example.bench.mod06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen168Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen168.compute5(42), Gen168.compute5(42));
    Thread.sleep(20);
  }
}
