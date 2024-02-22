package BaekjoonDeepening;

import java.util.Scanner;

public class 팰린드롬확인하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder();
		char[] ch = str.toCharArray();

		// 자리마다 문자 교환
		
		for (int i = 0; i < ch.length / 2; i++) {
			char temp;
			temp = ch[(ch.length) - 1 - i];
			ch[(ch.length) - 1 - i] = ch[i];
			ch[i] = temp;
		}
		
		
		// 교환한 문자 넣기
		
		for (int i = 0; i < ch.length; i++) {
			sb.append(ch[i]);
		}
		String str2 = sb.toString();
		
		
		// 기존 문자와 비교

		if (str.equals(str2)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
