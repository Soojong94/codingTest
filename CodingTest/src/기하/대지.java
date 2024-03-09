package 기하;

import java.util.Scanner;

public class 대지 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N * 2];

		for (int i = 0; i < N * 2; i++) {
			num[i] = sc.nextInt();
		}
		int widMax = num[0];
		int widMin = num[0];
		int lenMax = num[1];
		int lenMin = num[1];


		for (int i = 0; i < num.length; i += 2) {
			if (num[i] > widMax) {
				widMax = num[i];

			} else if (num[i] < widMin) {
				widMin = num[i];

			}
		}

		for (int i = 1; i < num.length; i += 2) {
			if (num[i] > lenMax) {
				lenMax = num[i];

			} else if (num[i] < lenMin) {
				lenMin = num[i];

			}
		}

		System.out.println((widMax - widMin) * (lenMax - lenMin));

	}

}
