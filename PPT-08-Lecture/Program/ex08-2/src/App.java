public class App {

	static boolean isPrime(long N) {
		for (long i = 2; i <= N - 1; i++) {
			if (N % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		long N = 999999999989L;
		System.out.println("正整数N=" + N + "を素数判定する");
		boolean prime = isPrime(N);

		if (prime == true) {
			System.out.println("素数");
		} else {
			System.out.println("合成数");
		}

		long endTime = System.currentTimeMillis();

		System.out.println("実行時間：" + (endTime - startTime) + "ms");
	}
}
