package BaekjoonDeepening;

import java.util.Scanner;

public class 크로아티아알파벳 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine().trim();
		String[] input = new String[] { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		int count = 0;
		int index = 0;

        while (index < str.length()) {
            boolean found = false;
            for (String pattern : input) {
                if (str.startsWith(pattern, index)) {
                    count++;
                    index += pattern.length();
                    found = true;
                    break;
                }
            }
            if (!found) {
                count++;
                index++;
            }
        }
		
		System.out.println(count);
	}

}
