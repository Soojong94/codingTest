package BaekjoonTwoDimensionalArray;

import java.util.Scanner;

public class 행렬덧셈 {

	public static void main(String[] args) {

		
		// 아래 방법보다 위 방법이 길이는 짧으나, 메모리 및 시간은 더 잡아먹음
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] arr = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] += sc.nextInt();
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}

	}
}

//		int[][] A = new int[N][M];
//		int[][] B = new int[N][M];
//		int[][] C = new int[N][M];
//
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < M; j++) {
//				A[i][j] = sc.nextInt();
//			}
//		}
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < M; j++) {
//				B[i][j] = sc.nextInt();
//			}
//		}
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < M; j++) {
//				C[i][j] = A[i][j] + B[i][j];
//				System.out.print(C[i][j] + " ");
//			}
//			System.out.println();
//
//		}
