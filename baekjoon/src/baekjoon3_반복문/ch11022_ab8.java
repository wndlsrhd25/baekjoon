package baekjoon3_반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ch11022_ab8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println("Case #"+i+": "+b+" + "+c+" = "+(b+c));
		}
	}

		
		
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int a = Integer.parseInt(br.readLine());
	
	StringTokenizer st;
	
	for (int i=0; i<a+1; i++) {
		st = new StringTokenizer(br.readLine()," ");
		
	
	System.out.println("Case #"+i+": "+(Integer.parseInt(st.nextToken())+"+"+(Integer.parseInt(st.nextToken()))+"=" +(Integer.parseInt(st.nextToken())+(Integer.parseInt(st.nextToken())));
	
	}

	}

}
