package com.example.bench.mod03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen096Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen096.compute5(42), Gen096.compute5(42));
    Thread.sleep(20);
  }
}
