package Baekjoon_array;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.util.Scanner;

public class 그대로출력하기 {

	public static void main(String[] args) {

//		입력 받은 대로 출력하는 프로그램

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			sb.append(str).append("|n");
		}
		System.out.println(sb);

	}

}
