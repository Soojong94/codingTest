package Multi_Divisor;

import java.util.ArrayList;
import java.util.Scanner;

public class divisor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		ArrayList<Integer> num = new ArrayList<Integer>();

		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				num.add(i);
			}
		}
		if (K > num.size()) {
			System.out.println(0);
		} else {
			System.out.println(num.get(K-1));
		}

	}

}
