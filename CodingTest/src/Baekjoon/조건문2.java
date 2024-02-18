package Baekjoon;

import java.util.Scanner;

public class 조건문2 {

	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		
		A += C / 60;
		B += C % 60 ;
		
		if ( B >= 60) {
			A ++;
		}
		
		if (A >= 24) {
			A = A - 24;
		}

		if (B >= 60) {
			B = B - 60;
		}
		
	
		System.out.println(A + " " + B);
		
//		H >= 1 && M-45 < 0 이면 H = H-1
//		H 가 0이고 M-45 < 0 이면 H = 23
//		M >= 45 이면 M = M-45
//		M < 45 이면 M = 60 - (M-45)*-1
		
//		if(H >= 1 && M-45 < 0) {
//			H = H-1;
//		}else if(H ==0 && M-45 < 0 )
//		{
//			H = 23;
//		}
//		if(M>=45) {
//			M = M-45;
//		}else if(M < 45) {
//			M = 60 - (M-45) * (-1);
//		}
//		System.out.println(H + " " + M);
//		
		
		
//		
//		
//		if (a > 0 && b> 0) {
//			System.out.println("1");
//		}else if(a<0 && b>0) {
//			System.out.println("2");
//		}else if(a<0 && b<0) {
//			System.out.println("3");
//		}else {
//			System.out.println("4");
//		}
		
		
//		if(a % 400 == 0) {
//			System.out.println("1");
//		}else if(a % 100 == 0) {
//			System.out.println("0");
//		}else if(a % 4 == 0) {
//			System.out.println("1");
//		}else {
//			System.out.println("0");
//		}
//		
		

//		if (a >= 90) {
//			System.out.println("A");
//		} else if (a >= 80) {
//			System.out.println("B");
//		} else if (a >= 70)
//
//		{
//			System.out.println("C");
//		} else if (a >= 60)
//
//		{
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}

//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		
//		if(A>B) {
//			System.out.println(">");
//		}else if(A < B) {
//			System.out.println("<");
//		}else {
//			System.out.println("==");
//		}
	}

}