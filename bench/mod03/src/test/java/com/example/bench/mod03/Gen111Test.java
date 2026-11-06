package com.example.bench.mod03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen111Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen111.compute5(42), Gen111.compute5(42));
    Thread.sleep(20);
  }
}
