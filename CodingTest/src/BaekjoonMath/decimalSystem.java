package BaekjoonMath;

import java.util.Scanner;

public class decimalSystem {

	public static void main(String[] args) {

		// 아스키 코드를 사용해서 출력할 때 값을 재설정해서 곱해주기
		// A = 65 / Z = 90
		// 스캐너 사용

		Scanner sc = new Scanner(System.in);

		String N = sc.next();
		int B = sc.nextInt();
		
		// 알고리즘 사용
		
//		int[] num = new int[N.length()];
//		int sum = 0;
//
//		for (int i = 0; i < N.length(); i++) {
//			if ((int) N.charAt(i) > 64) {
//				num[i] = (int) N.charAt(i) - 55;
//			} else {
//				num[i] = (int) N.charAt(i) - 48;
//			}
//		}
//
//		for (int i = num.length - 1; i >= 0; i--) {
//
//			sum += num[i] * Math.pow(B, num.length - 1 - i);
//
//		}
//
//		System.out.println(sum);
		
		// 함수사용
		// A :10 ~ Z:35 의 숫자가 규정됨 <> 아스키코드와 다름
		 
		System.out.println(Integer.parseInt(N, B));

	}

}
