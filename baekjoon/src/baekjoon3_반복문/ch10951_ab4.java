package baekjoon3_반복문;

import java.util.Scanner;

public class ch10951_ab4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		//hasNext() 다음에 가져올 값이 잇으면 true, 없으면 false
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
			
		}
		
	}

}

//https://st-lab.tistory.com/40