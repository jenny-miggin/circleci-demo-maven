package com.example.bench.mod12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen055Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen055.compute5(42), Gen055.compute5(42));
    Thread.sleep(20);
  }
}
