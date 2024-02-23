package BaekjoonTwoDimensionalArray;

import java.util.Scanner;

public class 최댓값 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		int index1 = 0; // 행인덱스
		int index2 = 0; // 열인덱스
		int max = 0;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
				if (max < arr[i][j]) {
					max = arr[i][j];
					index1 = i;
					index2 = j;
				}

			}
		}

		System.out.println(max);
		System.out.printf("%d %d", index1 + 1, index2 + 1);

	}

}
