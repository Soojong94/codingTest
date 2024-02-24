package BaekjoonString;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class 그대로출력하기 {

	public static void main(String[] args) throws IOException{

		// 1번 방법

//		Scanner sc = new Scanner(System.in);
//
//		while (sc.hasNext()) {
//			String str = sc.nextLine();
//			System.out.println(str);
//		}

		// 2번 방법

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	
			String line = null;
			StringBuilder sb = new StringBuilder();

			while ((line = br.readLine()) != null) {
				sb.append(line);
				sb.append("\n");
			}
			bw.write(sb.toString());
			bw.flush();
			br.close();
			bw.close();

		
	}
}
