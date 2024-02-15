package Programmers;

import java.util.Scanner;

public class 붙여서출력하기 {

	public static void main(String[] args) {
		
		// isWhitespace , StringBuilder , \s : 공백문자

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        StringConcatException(a);
        StringConcatException(b);
        
        
    }

	private static void StringConcatException(String a) {
		System.out.print(a);
		
	}

	}


