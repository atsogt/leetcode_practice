public class Factorial {
  public recursiveFactorial(int n) {
    if(n == 1) {
      return 1;
    }
    return n * recursiveFactorial(n - 1);
  }
}