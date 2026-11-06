package com.example.bench.mod02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen056Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen056.compute5(42), Gen056.compute5(42));
    Thread.sleep(20);
  }
}
