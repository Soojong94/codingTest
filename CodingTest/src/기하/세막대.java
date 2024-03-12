package 기하;

import java.util.Arrays;
import java.util.Scanner;

public class 세막대 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = 0;

		int[] num = new int[] {a,b,c};
		
		Arrays.sort(num);
		
		if (num[2] >= num[0] + num[1]) {
			num[2] = num[1] + num[0] - 1;
		}
		for(int i : num) {
			sum += i;
		}System.out.println(sum);
		

	}

}
