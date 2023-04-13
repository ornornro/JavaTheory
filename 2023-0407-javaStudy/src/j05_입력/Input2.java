package j05_입력;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		/*
		 * 실습!
		 * 					
		 * 이름 : 홍길동		next()		변수명 : name
		 * 생일 : 320			nextInt()			birth
		 * 주소 : 부산 진구		nextLine()			address
		 * 연락처 : 010-3300-4698 next()			phone
		 * 
		 * 출력
		 * 이름 : 홍길동
		 * 생일 : 320
		 * 주소 : 부산 진구
		 * 연락처 : 010-3300-4698
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		int birth = 0;
		String address = null;
		String phone = null;
		
		System.out.print("이름 : ");
		name = scanner.next();
		
		System.out.print("생일 : ");
		birth = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("주소 : ");
		address = scanner.nextLine();
		
		System.out.print("연락처 : ");
		phone = scanner.next();
		
		System.out.println(name);
		System.out.println(birth);
		System.out.println(address);
		System.out.println(phone);
	}

}


















