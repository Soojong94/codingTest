package BaekjoonLoop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class EOF_F {

	public static void main(String[] args)  {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {StringTokenizer st;

		while (true) {
			String line = br.readLine();
			if (line == null || line == "" ){ // 입력이 끝나면 종료
				break;
			}

			st = new StringTokenizer(line);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			bw.write((A + B) + "\n");

		}
		br.close();
		bw.flush();
		bw.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
