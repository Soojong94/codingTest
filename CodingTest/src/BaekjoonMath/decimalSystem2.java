package BaekjoonMath;

import java.util.ArrayList;
import java.util.Scanner;

public class decimalSystem2 {

	public static void main(String[] args) {


		//변수 선언

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int NLength = 0;

		// 10진법 숫자를 주어진 진법 숫자로 바꾸는 작업  + 리스트 담기
		
		while (N > 0) {

			arr.add(N % B);
			N = N / B;
			
			// 몇개의 몫이 나오는지 카운트
			
			NLength++;
			
		}

		// 반복 돌리기(반대로 출력) , 아스키코드 사용
		
		for (int i = NLength -1 ; i >= 0; i--) {
			if (arr.get(i) >= 10) {
				System.out.printf("%c", arr.get(i) + 55);
			} else {
				System.out.print(arr.get(i));
			}
		}
	}
}
