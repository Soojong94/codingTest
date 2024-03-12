package Multi_Divisor;

import java.util.Scanner;

public class divisor3 {

	public static void main(String[] args) {

		// 소인수분해 : 소수인 인수로 수를 나누는 것
		// 주어진 수가 소수인지 판단
		// 소수가 아니라면 소인수분해
		// 1 은 미포함 루트 N 까지 나누기
		// 루트 N 은 Math.sqrt(N);
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double M = Math.sqrt(N);
		for (int i = 2; i <= M; i++) {

			while (N % i == 0) {
				System.out.println(i);
				N /= i;
			}
		}
		if(N != 1) {
			System.out.println(N);
		}

	}

}
