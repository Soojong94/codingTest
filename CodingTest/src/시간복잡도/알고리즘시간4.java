package 시간복잡도;

import java.util.Scanner;

public class 알고리즘시간4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum = 0;
		for (int i = 1; i <= n - 1; i++) {
			sum += i;
		}

		System.out.println(sum);
		System.out.println('2');

	}

}
