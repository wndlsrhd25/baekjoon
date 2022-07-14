package baekjoon3_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ch15552_빠른ab {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// readLine()은 입력값으로 들어온 데이터를 한 줄로 읽어서 String으로 바꾸는 메소
		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			String str = br.readLine();

			StringTokenizer st = new StringTokenizer(str);
			// StringTokenizer의 nextToken() 함수를 쓰면 readLine()을 통해 입력 받은 값을 공백 단위로 구분하여 순서대로 호출
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		bw.flush();
		bw.close();
	}
}
