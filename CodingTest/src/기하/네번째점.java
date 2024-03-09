package 기하;

import java.util.Scanner;

public class 네번째점 {

	public static void main(String[] args) {

		/*
		 * 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오. 세 점의 좌표가 한 줄에
		 * 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다. 직사각형의 네 번째 점의 좌표를 출력한다.
		 */

		// 축에 평행한 직사각형

		Scanner sc = new Scanner(System.in);
		int[] nums = new int[6];

		for (int i = 0; i < 6; i++) {
			
			nums[i] = sc.nextInt();

		}
		
		int wid = nums[0];
		int len = nums[1];

		if (nums[0] == nums[2]) {
			wid = nums[4];
		} else if (nums[0] == nums[4]) {
			wid = nums[2];
		}
		
		if (nums[1] == nums[3]) {
			len = nums[5];
		} else if (nums[1] == nums[5]) {
			len = nums[3];
		}

		System.out.print(wid + " " + len);

	}

}
