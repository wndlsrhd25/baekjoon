package baekjoon2_조건문;

import java.util.Scanner;

public class ch2884_알람시계 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();

		if (h == 0) {
			if (m<45) {
				h =23;
				System.out.println(h + " " + (m - 45 + 60));
			} else {
				System.out.println(h + " " + (m - 45));
			}
		} else {
			if (m<45) {
				System.out.println((h-1) + " " + (m - 45 + 60));
			} else {
				System.out.println(h + " " + (m - 45));
			}
		}
	}
}
