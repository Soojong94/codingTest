package BaekjoonDeepening;

import java.util.Scanner;

public class 그룹단어체커 {

	public static void main(String[] args) {

		// 연속하는 단어를 포함 or 한번씩만 등장 / 떨어져서 등장하면 안 됨

		// boolean 배열을 이용해서 풀기

		// 변수 선언

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int result = 0;

		// 참거짓 검사

		for (int k = 0; k < T; k++) {
			String answer = sc.next();
			boolean[] isExist = new boolean[26];
			boolean isGroup = true;

			for (int i = 0; i < answer.length(); i++) {
				char ch = answer.charAt(i);
				int index = ch - 'a';

				// 그룹단어 판별
				// 이미 존재하는 단어이면  false 반환
				
				if (isExist[index]) {
					isGroup = false;
					break;
				}
				
				// break 되지 않았으면 true 값을 넣음
				
				isExist[index] = true;
				
				// 연속한 문자가 동일하면 i++해서 옆에 없을 때까지 건너뛰고 다시 for 문으로 올라가서 검사

				while (i + 1 < answer.length() && answer.charAt(i + 1) == ch) {
					i++;
				}
			}
			
			// isGroup 값이 true 이면 result 값 1증가 		
			if (isGroup) {
				result++;
			}

		}
		System.out.println(result);

	}

}
