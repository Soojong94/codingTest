package BaekjoonDeepening;

import java.util.Scanner;

public class 단어공부 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 변수 선언

		String str = sc.nextLine().toLowerCase();
		char[] alpha = new char[26];
		char[] beta = str.toCharArray();
		int[] count = new int[26];
		int index = 0;
		int max = 0;
		int countMax = 0;
		

		// 알파벳 넣기

		for (int j = 0; j < 26; j++) {
			alpha[j] = (char) (j + 97);
		}

		// 반복문으로 카운트

		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < beta.length; j++) {
				if (alpha[i] == beta[j]) {
					count[i]++;
				}
			}
		}

		// 반복문으로 가장 높은 카운트값 찾기 / 인덱스 설정
		for (int i = 0; i < count.length; i++) {
			if (count[i] > max) {
				max = count[i];
				index = i;
			}
		}
	
		// 인덱스 찾기
		

		for(int i = 0 ; i < count.length ; i++) {
			if(max == count[i]) {
				countMax++;
			}
		}
		if(countMax > 1) {
			System.out.println("?");
		}else {
			System.out.printf("%c" , index + 65);
		}
	}
}
