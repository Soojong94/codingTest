package Multi_Divisor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class divisor2 {

	public static void main(String[] args) throws IOException {

		// 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 반복문 : -1이면 break

		while (true) {

			String str = br.readLine();
			int n = Integer.parseInt(str);

			if (n == -1) {
				break;
			}

			ArrayList<Integer> num = new ArrayList<Integer>();
			int sum = 0;

			for (int i = 1; i <= n / 2; i++) {

				if (n % i == 0) {
					sum += i;
					num.add(i);
				}
			}
			if (sum == n) {
				bw.write(n + " = ");
				for (int j = 0; j < num.size() - 1; j++) {
					bw.write(num.get(j) + " + ");
				}
				bw.write(num.get(num.size() - 1) + "\n");
			} else {

				bw.write(n + " is NOT perfect.\n");

			}

		}
		bw.flush();
		br.close();
		bw.close();
	}
}
