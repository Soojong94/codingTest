package BaekjoonMath;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 세탁소사장동혁 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		int T = Integer.parseInt(str);
		int[] arr = new int[4];

		for (int i = 0; i < T; i++) {
			String str2 = br.readLine();
			int a = Integer.parseInt(str2);
			arr[0] = a / 25;
			a = a % 25;
			arr[1] = a / 10;
			a = a % 10;
			arr[2] = a / 5;
			a = a % 5;
			arr[3] = a;
			for (int j = 0; j < arr.length; j++) {
				bw.write(arr[j] + " ");		
			}
			bw.write("\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
