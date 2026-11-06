package com.example.bench.mod12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen163Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen163.compute5(42), Gen163.compute5(42));
    Thread.sleep(20);
  }
}
