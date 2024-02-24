package BaekjoonString;

import java.util.Scanner;

public class 다이얼 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] al = { "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
		int[] time = { 3, 4, 5, 6, 7, 8, 9, 10 };
		int total = 0;
		String line = sc.next();
		
		for (char ch : line.toCharArray()) {
			for(int i = 0 ; i < al.length ; i ++) {
				if(al[i].contains(String.valueOf(ch))) {
					total += time[i];
				}
			}
		}
		System.out.println(total);

//		char[] ch = new char[26];
//		String[] str = new String[26];
//		String[] strNew = new String[9];
//		int index = 0;
//
//		strNew[0] = "";
//		strNew[6] = "PQRS";
//		strNew[8] = "WXYZ";
//		strNew[7] = "TUV";
//
//		for (int i = 65; i < 91; i++) {
//			ch[i - 65] = (char) i;
//			str[i - 65] = String.valueOf(ch[i - 65]);
//		}
//
//		for (int i = 1; i < 6; i++) {
//			for (int j = 0; j < 2; j++) {
//				strNew[i] = str[j + (i - 1) * 3].concat(str[j + 1 + (i - 1) * 3]).concat(str[j + 2 + (i - 1) * 3]);
//				j += 2;
//
//			}
//
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		String A = sc.nextLine();
//		String[] B = A.split("");
//		
//
//		for (int i = 0; i < B.length; i++) {
//			for (int j = 0; j < strNew.length; j++) {
//				for (int k = 0 ; k < strNew[j].length(); k++) {
//					if (strNew[j].contains(B[i])) {
//						index += i;
//				}
//				
//					
//					
//				}
//			}
//		}

	}

}
