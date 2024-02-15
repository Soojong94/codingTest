package Programmers;

public class 홀짝에따라다른값반환 {

	public int solution(int n) {

		int answer = 0;
//		 * 양의 정수 n이 매개변수로 주어질 때, 
//		 * n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 

		if (n % 2 == 1) {
			for (int i = n; i > 0; i -= 2) {
				answer += i;
			}
		}

//		 * n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
		
//		제곱수는 Math.pow(i, j) 활용가능

		else {
			for (int i = n; i > 0; i -= 2) {
				answer += i * i;
			}
		}

		return answer;

		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 입출력 예 설명
		 * 
		 * 입출력 예 #1
		 * 
		 * 예제 1번의 n은 7로 홀수입니다. 7 이하의 모든 양의 홀수는 1, 3, 5, 7이고 이들의 합인 1 + 3 + 5 + 7 = 16을
		 * return 합니다.
		 * 
		 * 입출력 예 #2
		 * 
		 * 예제 2번의 n은 10으로 짝수입니다. 10 이하의 모든 양의 짝수는 2, 4, 6, 8, 10이고 이들의 제곱의 합인 22 + 42 +
		 * 62 + 82 + 102 = 4 + 16 + 36 + 64 + 100 = 220을 return 합니다.
		 * 
		 * 
		 */

	}

}
