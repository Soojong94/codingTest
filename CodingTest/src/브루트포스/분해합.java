package 브루트포스;

import java.util.ArrayList;
import java.util.Scanner;

public class 분해합 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String N = sc.next();

		char[] A = N.toCharArray();
		int[] num = new int[A.length];
		int x = 0;
		for (int i = 0; i < A.length; i++) {
			num[i] = (int) (A[i] - 117) ;
			x -= num[i];
		}
		
		System.out.println(x);

	}

}
