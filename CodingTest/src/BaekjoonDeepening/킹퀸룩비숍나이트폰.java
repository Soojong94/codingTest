package BaekjoonDeepening;

import java.util.Scanner;

public class 킹퀸룩비숍나이트폰 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int [] numbers = new int[] {1,1,2,2,2,8};
		int [] actual= new int[6];
		
		for (int i = 0 ; i < 6 ; i++) {
			int A = sc.nextInt();
			actual[i] = A;
			System.out.print(numbers[i] - actual[i] + " ");
		}
		
	}

}
