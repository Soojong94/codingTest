package Multi_Divisor;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			boolean isPrime = true;
			if (num == 1) {
				continue;
			}
			if (num % 2 == 0) {
				count += num == 2 ? 1 : 0;
				continue;
			}

			for (int j = 3; j < num / 2; j += 2) {
				// 약수
				if (num % j == 0) {
					isPrime = false;
					break;
				}

			}
			if (isPrime) {
				count++;
			}
		}
		System.out.println(count);

	}

}
