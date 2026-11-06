package com.example.bench.mod09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen141Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen141.compute5(42), Gen141.compute5(42));
    Thread.sleep(20);
  }
}
