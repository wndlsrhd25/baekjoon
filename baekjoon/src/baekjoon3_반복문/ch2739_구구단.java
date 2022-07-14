package baekjoon3_반복문;

import java.util.Scanner;

public class ch2739_구구단 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int mul;
		
		for(int i=1; i<10; i++) {
			mul= a*i;
			System.out.println(a+" * "+i +" = " +mul);
		}
		
	}
}

