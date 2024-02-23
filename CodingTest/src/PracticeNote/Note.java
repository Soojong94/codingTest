package PracticeNote;

import java.util.Scanner;

public class Note {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = sc.next();

		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.indexOf(word.charAt(i), i + 1)); 
		}
	}

}
