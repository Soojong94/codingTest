package BaekjoonDeepening;

import java.util.Scanner;

public class 너의평점은 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double sum = 0; // (학점 × 과목평점)
		double totalScore = 0; // 과목의 학점 총합

		for (int i = 0; i < 20; i++) {

			String subject = sc.next();
			double score = sc.nextDouble();
			String grade = sc.next();

			totalScore += score;
			switch (grade) {
			case "A+":
				sum += score * 4.5;
				break;
			case "A0":
				sum += score * 4.0;
				break;
			case "B+":
				sum += score * 3.5;
				break;
			case "B0":
				sum += score * 3.0;
				break;
			case "C+":
				sum += score * 2.5;
				break;
			case "C0":
				sum += score * 2.0;
				break;
			case "D+":
				sum += score * 1.5;
				break;
			case "D0":
				sum += score * 1.0;
				break;
			case "F":
				sum += score * 0.0;
				break;
			case "P":
				totalScore -= score;
				break;
				
			}
			
		}
			System.out.println(sum / totalScore);
	}
}

//
//			if (grade.equals("A+")) {
//				A = (double) (score * 4.5);
//			} else if (grade.equals("A0")) {
//				A = (double) (score * 4.0);
//			} else if (grade.equals("B+")) {
//				A = (double) (score * 3.5);
//			} else if (grade.equals("B0")) {
//				A = (double) (score * 3.0);
//			} else if (grade.equals("C+")) {
//				A = (double) (score * 2.5);
//			} else if (grade.equals("C0")) {
//				A = (double) (score * 2.0);
//			} else if (grade.equals("D+")) {
//				A = (double) (score * 1.5);
//			} else if (grade.equals("D0")) {
//				A = (double) (score * 1.0);
//			} else {
//				A = 0;
//			}
//			// 더해주는 부분
//			if (!grade.equals("P")) {
//				sum += A;
//				totalScore += score; // 과목의 학점을 누적
//			}
//		}
//		System.out.println(sum / totalScore);
//	}
//}