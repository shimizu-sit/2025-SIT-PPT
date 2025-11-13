public class App {

  static boolean isPrime(int N) {
    for (int i = 2; i <= N - 1; i++) {
      if (N % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) throws Exception {
    System.out.println("正整数N=2147483647を素数判定する");
    boolean prime = isPrime(2147483647);

    if (prime == true) {
      System.out.println("素数");
    } else {
      System.out.println("合成数");
    }
  }
}
