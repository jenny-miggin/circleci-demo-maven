package com.example.bench.mod03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen007Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen007.compute5(42), Gen007.compute5(42));
    Thread.sleep(20);
  }
}
