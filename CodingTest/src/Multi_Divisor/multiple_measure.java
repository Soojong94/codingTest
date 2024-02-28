package Multi_Divisor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class multiple_measure {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		while (true) {
			String str = br.readLine();
			st = new StringTokenizer(str);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			if (A == 0 && B == 0) {
				break;
			}
			if (B % A == 0) {
				bw.write("factor\n");
			} else if (A % B == 0) {
				bw.write("multiple\n");
			} else {
				bw.write("neither\n");
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
