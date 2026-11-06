package com.example.bench.mod01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Gen136Test {
  @Test
  void deterministic() throws Exception {
    assertEquals(Gen136.compute5(42), Gen136.compute5(42));
    Thread.sleep(20);
  }
}
