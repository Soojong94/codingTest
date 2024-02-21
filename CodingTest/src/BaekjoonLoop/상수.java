package BaekjoonLoop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 상수 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {

			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);

			String[] number1 = st.nextToken().split("");
			String[] number2 = st.nextToken().split("");

			String temp;
			temp = number1[0];
			number1[0] = number1[(number1.length - 1)];
			number1[(number1.length - 1)] = temp;

			temp = number2[0];
			number2[0] = number2[(number2.length - 1)];
			number2[(number2.length - 1)] = temp;

			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();

			for (int i = 0; i < number1.length; i++) {
				sb1.append(number1[i]);
				sb2.append(number2[i]);
			}
			String str1 = sb1.toString();
			String str2 = sb2.toString();

			int A = Integer.parseInt(str1);
			int B = Integer.parseInt(str2);

			int result = (A > B) ? A : B;

			bw.write(Integer.toString(result));
			bw.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
