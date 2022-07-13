package baekjoon6_문자열;

import java.util.Scanner;

public class ch11720_숫자의합 {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	int num = sc.nextInt();
	String strNum = sc.next();
	
	int result = 0;
	for(int i=0;i<strNum.length(); i++) {
		result +=Character.getNumericValue(strNum.charAt(i));
	}
	System.out.println(result);

	
	/*
	// 더해야하는 자리수
	int count = sc.nextInt(); 
	//더할 숫자 --> 문자열로 변경해야함
	String input = sc.nextLine();
	
	//합계 구하기
	String[] result = new String[input.length()];
	int sum =0;
	for(int i=0; i<count; i++) {
		result[i] = input.substring(i,i+1);
		sum+= Integer.parseInt(result[i]);
	}
	System.out.println(sum);
	*/
	}

	
}

