package baekjoon3_반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ch10951_ab4 {

	public static void main(String[] args) throws IOException {
		
//		Scanner sc = new Scanner(System.in);
//
//		//hasNext() 다음에 가져올 값이 잇으면 true, 없으면 false
//		while (sc.hasNext()) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			System.out.println(a+b);
//			
//		}
//		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		
		
		while((str=br.readLine())!=null) {
			st = new StringTokenizer(str," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a+b).append("\n");
			
		}
		System.out.print(sb);
		
		
	}

}

