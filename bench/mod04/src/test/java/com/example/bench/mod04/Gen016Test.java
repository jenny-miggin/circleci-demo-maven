package com.example.bench.mod04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen016Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen016.compute5(42), Gen016.compute5(42));
    Thread.sleep(20);
  }
}
