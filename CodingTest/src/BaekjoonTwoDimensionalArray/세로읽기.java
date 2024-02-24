package BaekjoonTwoDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class 세로읽기 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = new String[5];

		for (int i = 0; i < 5; i++) {
			arr[i] = br.readLine();
		}

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (i < arr[j].length()) {
					bw.write(arr[j].charAt(i));
				}
			}
		}
		bw.flush();
		br.close();
		bw.close();

	}

}
