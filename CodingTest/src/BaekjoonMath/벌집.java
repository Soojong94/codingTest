package BaekjoonMath;

import java.util.Scanner;

public class 벌집 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		// 1 + 6개까지는 1
		// 1+6+6+6 까지 2
		// 1+6+6+6+6+6+6 까지는 3
		// 거리 = 기존 개수 + 6*i
		if (N == 1) {
			cnt++;
		} else {
			N = N - 1;
			for (int i = 0; N > 0; i++) {
				N -= i * 6;
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}
