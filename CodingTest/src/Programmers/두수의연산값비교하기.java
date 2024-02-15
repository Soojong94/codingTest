package Programmers;

public class 두수의연산값비교하기 {

    public int solution(int a, int b) {

    	int answer = 0;
    	String ab = Integer.toString(a)+Integer.toString(b);
    	int cd = Integer.parseInt(ab);
    	
//    	int ab = Integer.parseInt(a +  "" + b) ; 문자열로 바뀌기 때문에 바로 함수 사용 가능
    	
    	if (cd >= 2*a*b) {
    		answer = cd;
    		System.out.println(answer);
    	}else {
    		answer = 2*a*b;
    		System.out.println(answer);
    	}
    	
        return answer;
		
	}

}
