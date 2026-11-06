package com.example.bench.mod10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen115Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen115.compute5(42), Gen115.compute5(42));
    Thread.sleep(20);
  }
}
