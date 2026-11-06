package com.example.bench.mod02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen119Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen119.compute5(42), Gen119.compute5(42));
    Thread.sleep(20);
  }
}
