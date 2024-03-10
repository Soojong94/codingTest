package 기하;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 삼각형과세변 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		while (true) {
			String str = br.readLine();
			st = new StringTokenizer(str);

			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			int num3 = Integer.parseInt(st.nextToken());

			if (num1 == 0 && num2 == 0 & num3 == 0) {
				break;
			}
			if (num1 >= num2 + num3 || num2 >= num1 + num3 || num3 >= num2 + num1) {
				bw.write("Invalid");
			} else if (num1 == num2 && num2 == num3) {
				bw.write("Equilateral");
			} else if (num1 == num2 || num2 == num3 || num1 == num3) {
				bw.write("Isosceles");
			} else if (num1 != num2 && num2 != num3 && num1 != num3) {
				bw.write("Scalene");
			}
			bw.write("\n");

		}

		bw.flush();
		br.close();
		bw.close();

	}

}
