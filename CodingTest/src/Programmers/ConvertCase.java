package Programmers;

import java.util.Scanner;

public class ConvertCase {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		convert(a);

	}

	public static void convert(String a) {
		char[] char1 = a.toCharArray();
		for (int i = 0; i < a.length(); i++) {
			if (Character.isUpperCase(char1[i]) == true) {
				char1[i] = (char) Character.toLowerCase(char1[i]);
			} else if (Character.isLowerCase(char1[i]) == true) {
				char1[i] = (char) Character.toUpperCase(char1[i]);
			}
		}
		System.out.println(char1);
	}

}

//
//import java.util.Scanner;
//
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//
//        String answer = "";
//
//        for(int x : a.toCharArray()){
//        if(x>=97 && x<=122)answer += (char)(x-32); else answer += (char)(x+32);
//
//
//}
//        System.out.print(answer);
//    }
//    }
