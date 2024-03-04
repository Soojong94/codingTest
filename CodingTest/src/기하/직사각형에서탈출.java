package 기하;

import java.util.Scanner;

public class 직사각형에서탈출 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		int min1 = Math.min(x - 0, w - x);
		int min2 = Math.min(y - 0, h - y);
		int min3 = Math.min(min1, min2);

		System.out.println(min3);
	}

}
