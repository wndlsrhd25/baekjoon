package baekjoon1_입출력과사칙연산;

import java.util.Scanner;

public class ch2588_곱셈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println(a*((b%100)/10));
		System.out.println(a*(b/100));
		System.out.println((a*(b%10))+(a*((b%100)/10))*10+(a*(b/100))*100);
	}

}
