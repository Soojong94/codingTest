package Programmers;

public class 더크게합치기 {

	public int solution(int a, int b) {

		int answer = 0;
		String str1 = String.valueOf(a);
		String str2 = String.valueOf(b);
		String str12 = str1 + str2;
		String str21 = str2 + str1;

		if (Integer.parseInt(str21) > Integer.parseInt(str12)) {
			answer = Integer.parseInt(str21);
		} else {
			answer = Integer.parseInt(str12);
		}
		
		
		return answer;
		
		/*
		 * 입출력 예 설명 
		 * 
		 * 입출력 예 #1
		 * a ⊕ b = 991 이고, b ⊕ a = 919 입니다. 둘 중 더 큰 값은 991 이므로 991을 return 합니다.
		 *  
		 * 입출력 예 #2
		 * a ⊕ b = 898 이고, b ⊕ a = 889 입니다. 둘 중 더 큰 값은 898 이므로 898을 return 합니다.
		 */
		
		

		
	}

}
