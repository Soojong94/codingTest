package Multi_Divisor;

import java.util.ArrayList;
import java.util.Scanner;

public class primeNumber2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		ArrayList<Integer> num = new ArrayList<Integer>();
		int sum = 0;

		// 소수 구하기

		for (int i = M; i <= N; i++) {
			boolean isCheck = true;
			if (i <= 1) {
				continue;
			}
			if (i % 2 == 0) {
				if (i != 2) {
					isCheck = false;
				}

			} else {
				for (int j = 3; j * j <= i; j += 2) {
					if (i % j == 0) {
						isCheck = false;
						break;
					}

				}
			}

			if (isCheck) {
				num.add(i);
				sum += i;
			}
		}

		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(num.get(0));
		}
	}

}
