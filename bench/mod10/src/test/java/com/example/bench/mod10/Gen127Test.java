package com.example.bench.mod10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen127Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen127.compute5(42), Gen127.compute5(42));
    Thread.sleep(20);
  }
}
