package engine.tools;

public class Fib {
  public static long fib(int n) {
    if (n <= 1) return n;
    else return fib(n-1) + fib(n-2);
  }
}