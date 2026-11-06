package com.example.bench.mod06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen146Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen146.compute5(42), Gen146.compute5(42));
    Thread.sleep(20);
  }
}
