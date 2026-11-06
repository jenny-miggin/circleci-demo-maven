package com.example.bench.mod06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen042Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen042.compute5(42), Gen042.compute5(42));
    Thread.sleep(20);
  }
}
