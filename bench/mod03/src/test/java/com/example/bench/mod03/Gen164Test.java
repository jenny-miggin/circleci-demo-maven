package com.example.bench.mod03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen164Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen164.compute5(42), Gen164.compute5(42));
    Thread.sleep(20);
  }
}
