package com.example.bench.mod15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen186Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen186.compute5(42), Gen186.compute5(42));
    Thread.sleep(20);
  }
}
