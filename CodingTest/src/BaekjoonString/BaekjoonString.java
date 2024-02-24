package BaekjoonString;
import java.util.Scanner;

public class BaekjoonString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S =sc.next();
		char [] ch = S.toCharArray();
		int i = sc.nextInt();
		
		System.out.println(ch[i-1]);
		
	}

}
