package 브루트포스;

import java.util.ArrayList;
import java.util.Scanner;

public class blackJack {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 입력받는 숫자 개수
		int M = sc.nextInt(); // 3개의 합이 M에 가까워야함
		int[] num = new int[N];

		

		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		
		int answer = 0; 

		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					int sum = num[i] + num[j] + num[k];
					if (sum <= M && sum > answer) {
						answer = sum;
					}
				}
			}
		}

		System.out.println(answer);

	}

}
