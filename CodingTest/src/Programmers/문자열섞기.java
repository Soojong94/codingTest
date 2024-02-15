package Programmers;

public class 문자열섞기 {

	public String solution(String str1, String str2) {

		String answer = "";

		for (int i = 0; i < str1.length(); i++) {


			answer += str1.charAt(i);
			answer += str2.charAt(i);

		}
		return answer;
		
//		기존에 썼던 식
		
//		String str3 = str1.substring(i, i + 1);
//		String str4 = str2.substring(i, i + 1);

// 길이가 같은 두 문자열 str1과 str2가 주어집니다.

// 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.

//		입출력 예
//		str1	str2	result
//		"aaaaa"	"bbbbb"	"ababababab"

	}

}
