package 시간복잡도;

import java.util.Scanner;

public class 알고리즘6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum = 0;
		long cnt = 0;

		for (int i = 1; i < n; i++) {
			sum += cnt;
			cnt += i;
		}

		System.out.println(sum);
		System.out.println('3');


	}

}
