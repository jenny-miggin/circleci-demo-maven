package com.example.bench.mod04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen165Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen165.compute5(42), Gen165.compute5(42));
    Thread.sleep(20);
  }
}
