package baekjoon2_조건문;

import java.util.Scanner;

public class ch2753_윤년 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	
		/*
		 * 내가 푼것
		if (a%400==0) {
			System.out.println(1);
		} else if(a%4==0 && a%100!=0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		*/
		
		if(a%4==0) {
			if(a%100!=0 || a%400==0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
}
