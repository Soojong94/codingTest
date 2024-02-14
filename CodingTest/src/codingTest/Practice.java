package codingTest;

public class Practice {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;

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

	}

}
