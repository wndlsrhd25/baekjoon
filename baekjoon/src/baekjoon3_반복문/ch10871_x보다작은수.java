package baekjoon3_반복문;

import java.util.Scanner;

public class ch10871_x보다작은수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = 0; i < a; i++) {
			int temp = sc.nextInt();
			
			if(temp<b) {
				System.out.print(temp +" ");
			}

			
		}
	}

}
