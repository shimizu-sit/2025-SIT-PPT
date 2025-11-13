import java.util.Scanner;

public class App {

    static long GCD(long A, long B) {
        long Answer = 0;

        for (long i = 1; i <= Math.min(A, B); i++) {
            if (A % i == 0 && B % i == 0) {
                Answer = i;
            }
        }
        return Answer;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("正の整数AとBの最大公約数を求める");

        Scanner scan = new Scanner(System.in);

        System.out.println("正整数Aを入力");
        long A = scan.nextLong();

        System.out.println("正整数Bを入力");
        long B = scan.nextLong();

        long Answer = GCD(A, B);

        System.out.println("正の整数" + A + "と" + B + "の最大公約数は" + Answer + "です");
    }
}
