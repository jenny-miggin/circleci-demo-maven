package com.example.bench.mod01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen154Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen154.compute5(42), Gen154.compute5(42));
    Thread.sleep(20);
  }
}
