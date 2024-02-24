package BaekjoonTwoDimensionalArray;

import java.util.Scanner;

public class 색종이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int page = sc.nextInt();
		int[][] width = new int[100][100];
		int sum = 0;

		for (int i = 0; i < page; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int j = a; j < a + 10; j++) {
				for (int k = b; k < b + 10; k++) {
					width[j][k] = 1;
				}
			}
		}
		for (int[] i : width) {
			for (int j : i) {
				if (j == 1) {
					sum += 1;
				}
			}
		}
		System.out.println(sum);
	}
}

/*
 * 이 방법으로는 너무 어려움
 * 
 * 
 * // 색종이의 위치를 입력받음 for (int i = 0; i < page; i++) { arr[i][0] = sc.nextInt();
 * // 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리 arr[i][1] = sc.nextInt(); // 색종이의 아래쪽 변과 도화지의
 * 아래쪽 변 사이의 거리 }
 * 
 * // 색종이가 겹치는 부분의 넓이를 저장하는 배열 int[][] overlapArea = new int[page][page];
 * 
 * // 각 색종이 쌍에 대해 겹치는 부분의 넓이를 구하고 전체 넓이에서 빼줌 for (int i = 0; i < page; i++) {
 * int x1 = arr[i][0]; // 첫 번째 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리 int y1 = arr[i][1];
 * // 첫 번째 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리 for (int j = i + 1; j < page; j++) {
 * int x2 = arr[j][0]; // 두 번째 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리 int y2 = arr[j][1];
 * // 두 번째 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리
 * 
 * // 두 색종이가 겹치는 부분의 좌표 구하기 int overlapX1 = Math.max(x1, x2); // 겹치는 부분의 왼쪽 변
 * x좌표 int overlapX2 = Math.min(x1 + 10, x2 + 10); // 겹치는 부분의 오른쪽 변 x좌표 int
 * overlapY1 = Math.max(y1, y2); // 겹치는 부분의 아래쪽 변 y좌표 int overlapY2 =
 * Math.min(y1 + 10, y2 + 10); // 겹치는 부분의 위쪽 변 y좌표
 * 
 * // 겹치는 부분의 넓이를 구하여 배열에 저장 overlapArea[i][j] = Math.max(0, overlapX2 -
 * overlapX1) * Math.max(0, overlapY2 - overlapY1); } }
 * 
 * // 겹치는 부분의 넓이를 두 번 빼지 않도록 처리 for (int i = 0; i < page; i++) { for (int j = i
 * + 1; j < page; j++) { width -= overlapArea[i][j]; } }
 * 
 * // 결과 출력 System.out.println(width);
 *
 */