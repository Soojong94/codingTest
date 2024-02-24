package BaekjoonString;

import java.util.ArrayList;
import java.util.Scanner;

public class 문자열 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		ArrayList<String> str = new ArrayList<String>();
		
		for (int i = 0 ; i < T; i++) {
			String str2 = sc.next();
			str.add(str2);
		}
		for (int i = 0 ; i < T; i++) {
			char [] ch = str.get(i).toCharArray();
			System.out.printf("%s%s%n", ch[0] , ch[ch.length-1]);
		}
	}

}
