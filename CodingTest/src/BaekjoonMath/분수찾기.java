package BaekjoonMath;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class 분수찾기 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int X = Integer.parseInt(br.readLine());
		int line = 1;
		int count = 0;

		// 몇번째 배열에 있는지 검사
		while (count < X) {
			count += line++;
		}
		// 한 줄을 줄인 마지막 줄에 X가 위치해 있다
		line--;

		// X 와 count 의 차이 : 분자 분모의 위치를 찾기 위함
		// 해당 라인에서 몇번째 분수인지 확인
		int A = count - X;

		int nume; // 분자
		int deno; // 분모

		
		// 짝수 열일 때 
		if (line % 2 == 0) {			
			nume = line - A;
			deno = 1 + A;
			
		// 홀수 열일 때
		} else {
			nume = 1 + A;
			deno = line - A;	
		}

		bw.write(nume + "/" + deno);
		bw.flush();
		br.close();
		bw.close();

		/*
		 * 1 -> 1개 2 -> 2개 3 -> 3개 배열에 i 만큼 개수 추가 시작 1 / i 마지막 i / 1
		 */

		// 반복문 쓰면 메모리 초과
//		for (int i = 1; X > 0; i++) {
//			int count = 1;
//			for (int j = i; j > 0 && X > 0; j--) {
//				str.add(count + "/" + j);
//				X--;
//				count++;
//			}
//		}

	}
}
