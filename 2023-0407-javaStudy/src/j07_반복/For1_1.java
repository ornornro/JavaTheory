package j07_반복;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class For1_1 {

	public static void main(String[] args) {
		/*
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 4
		 * 3
		 * 2
		 * 1
		 */
		
		for(int i = 0; i < 9; i++) {
			if(i < 5) {
				System.out.println(i + 1);
			}else {
				System.out.println(9 - i);
			}
		}
		
		/* 홀수를 입력 받아 반은 올라가고 반은 내려가게
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("홀수를 입력하세요 : ");
		int a = scanner.nextInt();
		int b = a * 2 - 1; //줄 수
		
		for(int i = 0; i < b; i++) {
			if(i < a) {
				System.out.println(i + 1);
			}else {
				System.out.println(b - i);
			}
		}
		
	}

}















