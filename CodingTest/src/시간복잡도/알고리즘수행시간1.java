package 시간복잡도;

import java.util.Scanner;

public class 알고리즘수행시간1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 입력의 크기 n

		// 코드1의 수행 횟수 계산
		int count = 1;

		// 코드1의 수행 횟수를 다항식으로 나타내었을 때 최고차항의 차수 계산
		int degree = 0;
		if (n <= 1) {
			degree = 0; // 상수항
		} else if (n == 2) {
			degree = 1; // 1차 다항식
		} else if (n <= 4) {
			degree = 2; // 2차 다항식
		} else {
			degree = 4; // 최고차항의 차수가 3보다 크거나 다항식으로 나타낼 수 없음
		}

		System.out.println(count);
		System.out.println(degree);
	}

}
