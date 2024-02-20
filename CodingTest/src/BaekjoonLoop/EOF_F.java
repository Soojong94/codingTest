package BaekjoonLoop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class EOF_F {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			StringTokenizer st;
			String line = "";

			while ((line = br.readLine()) != null) {

				st = new StringTokenizer(line);

				if (st.hasMoreTokens()) {

					bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
				} else {
					break;
				}
			}
			br.close();
			bw.flush();
			bw.close();

		} catch (

		Exception e) {

		}
	}

}
