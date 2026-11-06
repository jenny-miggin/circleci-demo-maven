package com.example.bench.mod03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen180Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen180.compute5(42), Gen180.compute5(42));
    Thread.sleep(20);
  }
}
