package baekjoon3_반복문;

import java.util.Scanner;

public class ch1110_더하기사이클 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		
	int newNumber = 0;
	int num = sc.nextInt();
	
	int count =0;
	newNumber = num;
	while(true) {
		
		int a = newNumber/10;
		int b = newNumber%10;
		
		int sum =a+b;
		newNumber = (b*10)+(sum%10);
		count ++;
		if(newNumber==num) {
			break;
		}
	}
	System.out.println(count);
			
	}

}
