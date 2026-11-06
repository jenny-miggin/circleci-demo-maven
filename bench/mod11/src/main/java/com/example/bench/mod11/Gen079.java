package com.example.bench.mod11;

public final class Gen079 {
  private Gen079() {}
  public static long compute0(long x) {
    long acc = x;
    for (int k = 0; k < 3; k++) { acc = (acc * 31 + k) ^ (acc >>> 7); }
    return acc + java.util.List.of(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L).stream().mapToLong(Long::longValue).sum();
  }
  public static long compute1(long x) {
    long acc = x;
    for (int k = 0; k < 4; k++) { acc = (acc * 31 + k) ^ (acc >>> 7); }
    return acc + java.util.List.of(0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L).stream().mapToLong(Long::longValue).sum();
  }
  public static long compute2(long x) {
    long acc = x;
    for (int k = 0; k < 5; k++) { acc = (acc * 31 + k) ^ (acc >>> 7); }
    return acc + java.util.List.of(0L, 2L, 4L, 6L, 8L, 10L, 12L, 14L).stream().mapToLong(Long::longValue).sum();
  }
  public static long compute3(long x) {
    long acc = x;
    for (int k = 0; k < 6; k++) { acc = (acc * 31 + k) ^ (acc >>> 7); }
    return acc + java.util.List.of(0L, 3L, 6L, 9L, 12L, 15L, 18L, 21L).stream().mapToLong(Long::longValue).sum();
  }
  public static long compute4(long x) {
    long acc = x;
    for (int k = 0; k < 7; k++) { acc = (acc * 31 + k) ^ (acc >>> 7); }
    return acc + java.util.List.of(0L, 4L, 8L, 12L, 16L, 20L, 24L, 28L).stream().mapToLong(Long::longValue).sum();
  }
  public static long compute5(long x) {
    long acc = x;
    for (int k = 0; k < 8; k++) { acc = (acc * 31 + k) ^ (acc >>> 7); }
    return acc + java.util.List.of(0L, 5L, 10L, 15L, 20L, 25L, 30L, 35L).stream().mapToLong(Long::longValue).sum();
  }
  public static long compute6(long x) {
    long acc = x;
    for (int k = 0; k < 9; k++) { acc = (acc * 31 + k) ^ (acc >>> 7); }
    return acc + java.util.List.of(0L, 6L, 12L, 18L, 24L, 30L, 36L, 42L).stream().mapToLong(Long::longValue).sum();
  }
  public static long compute7(long x) {
    long acc = x;
    for (int k = 0; k < 10; k++) { acc = (acc * 31 + k) ^ (acc >>> 7); }
    return acc + java.util.List.of(0L, 7L, 14L, 21L, 28L, 35L, 42L, 49L).stream().mapToLong(Long::longValue).sum();
  }
  public static long compute8(long x) {
    long acc = x;
    for (int k = 0; k < 11; k++) { acc = (acc * 31 + k) ^ (acc >>> 7); }
    return acc + java.util.List.of(0L, 8L, 16L, 24L, 32L, 40L, 48L, 56L).stream().mapToLong(Long::longValue).sum();
  }
  public static long compute9(long x) {
    long acc = x;
    for (int k = 0; k < 12; k++) { acc = (acc * 31 + k) ^ (acc >>> 7); }
    return acc + java.util.List.of(0L, 9L, 18L, 27L, 36L, 45L, 54L, 63L).stream().mapToLong(Long::longValue).sum();
  }
  public static long compute10(long x) {
    long acc = x;
    for (int k = 0; k < 13; k++) { acc = (acc * 31 + k) ^ (acc >>> 7); }
    return acc + java.util.List.of(0L, 10L, 20L, 30L, 40L, 50L, 60L, 70L).stream().mapToLong(Long::longValue).sum();
  }
  public static long compute11(long x) {
    long acc = x;
    for (int k = 0; k < 14; k++) { acc = (acc * 31 + k) ^ (acc >>> 7); }
    return acc + java.util.List.of(0L, 11L, 22L, 33L, 44L, 55L, 66L, 77L).stream().mapToLong(Long::longValue).sum();
  }
}
