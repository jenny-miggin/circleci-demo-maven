package com.example.bench.mod13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen062Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen062.compute5(42), Gen062.compute5(42));
    Thread.sleep(20);
  }
}
