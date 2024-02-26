package BaekjoonMath;

import java.util.Scanner;

public class 중앙이동알고리즘 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int i = 2;

		for (int j = 0; j < N; j++) {
			i = i + (i - 1);
			sum = i * i;

		}
		System.out.println(sum);
	}

}
