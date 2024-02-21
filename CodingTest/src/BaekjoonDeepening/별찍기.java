package BaekjoonDeepening;

import java.util.Scanner;

public class 별찍기 {

	public static void main(String[] args) {

		// 공백 하나 - / 별 두개 ++ 첫 공백은 N-1

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			for (int j = N - 1 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 공백 하나 + / 별 두개 -- 마지막 공백은 N-1

		for (int i = 0; i < N; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (N * 2) - 3 - (2 * i) ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
