package com.example.bench.mod03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen162Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen162.compute5(42), Gen162.compute5(42));
    Thread.sleep(20);
  }
}
