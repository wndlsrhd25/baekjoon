package baekjoon3_반복문;

import java.util.Scanner;

public class ch2439_별찍기2 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	
	for(int i=1; i<a+1; i++) {
		for(int c=a; c>i; c--) {
			System.out.print(" ");
		}
		for(int j=1; j<i+1; j++) {
			System.out.print("*");
		}System.out.println("");
		
	}
	}

}
