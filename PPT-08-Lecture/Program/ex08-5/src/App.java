import java.util.Scanner;

public class App {

    static long EucludeanGCD(long A, long B) {
        while (A >= 1 && B >= 1) {
            if (A < B) {
                B = B % A;
            } else {
                A = A % B;
            }
        }
        if (A >= 1) {
            return A;
        }
        return B;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("正の整数AとBの最大公約数を求める");

        Scanner scan = new Scanner(System.in);

        System.out.println("正整数Aを入力");
        long A = scan.nextLong();

        System.out.println("正整数Bを入力");
        long B = scan.nextLong();

        long Answer = EucludeanGCD(A, B);

        System.out.println("正の整数" + A + "と" + B + "の最大公約数は" + Answer + "です");
    }
}
