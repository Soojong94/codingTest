package codingTest;


public class 문자열겹쳐쓰기 {

	class Solution {
		public String solution(String my_string, String overwrite_string, int s) {

//	    	문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
//	    	문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 
//	    	문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
//입출력 예 #1
//예제 1번의 my_string에서 인덱스 2부터 overwrite_string의 길이만큼에 해당하는 부분은 "11oWor1"이고 이를 "lloWorl"로 바꾼 "HelloWorld"를 return 합니다.

//입출력 예 #2
//예제 2번의 my_string에서 인덱스 7부터 overwrite_string의 길이만큼에 해당하는 부분은 "29b8UYP"이고 이를 "merS123"로 바꾼 "ProgrammerS123"를 return 합니다.



			String answer = "";
			char[] arr1 = my_string.toCharArray();
			char[] arr2 = overwrite_string.toCharArray();

			for (int i = 0; i < s; i++) {
				answer += (char) arr1[i];
			}
			for (int j = 0; j < arr2.length; j++) {
				answer += (char) arr2[j];
			}
			for (int i = s + arr2.length; i < arr1.length; i++) {
				answer += (char) arr1[i];
			}

			
			
//			substring 활용
			
			String a = my_string.substring(0, s);
			String b = my_string.substring(s + overwrite_string.length());
			
			return a + overwrite_string + b ;

		}

	}

}
