package baekjoon2_조건문;

import java.util.Scanner;

public class ch2525_오븐시계 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (b + c >= 60) {
			int A = (a + (b + c)/60);
			int B = ((b + c)%60);
			if (A > 23) {
				System.out.println((A - 24) + " " + B);
			} else {
				System.out.println(A + " " + B);
			}
		} else {
			System.out.println(a + " " + (b + c));
		}
	}
}
