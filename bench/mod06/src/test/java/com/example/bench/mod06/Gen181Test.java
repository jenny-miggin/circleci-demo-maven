package com.example.bench.mod06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen181Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen181.compute5(42), Gen181.compute5(42));
    Thread.sleep(20);
  }
}
