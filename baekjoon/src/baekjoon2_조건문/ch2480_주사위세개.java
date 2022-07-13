package baekjoon2_조건문;

import java.util.Scanner;

public class ch2480_주사위세개 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a==b && b==c ) {
			System.out.println(10000+a*1000);
		}else if(a==b || b==c || a==c) {
			if(a==b) {
				System.out.println(1000+a*100);
			} else if(b==c) {
				System.out.println(1000+b*100);
			} else {
				System.out.println(1000+c*100);
			}
		} else if (a!=b && b!=c) {
			if(a>b && a>c) {
				System.out.println(a*100);
			}else if(b>a && b>c) {
				System.out.println(b*100);
			}else {
				System.out.println(c*100);
			}
		}
	}
}
