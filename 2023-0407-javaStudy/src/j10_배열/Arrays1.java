package j10_배열;

import j09_클래스.Computer;

public class Arrays1 {

	public static void main(String[] args) {
		//정수 배열
		int[] numbers = new int[5];
		
		//문자열 배열
		String[] strArray = new String[3];
		
		//객체 배열
		Computer[] computers = new Computer[5];
		
		numbers[1] = 10;
		numbers[0] = 20;
		
		strArray[2] = "문자열";
		strArray[0] = "0";
		
		Computer computer = new Computer();
		computers[0] = computer;
		
		String info = "[name=홍길동, age=18, password=1111, hobby=baseball]";
		System.out.println(info.substring(6, 9)); // 홍길동
		System.out.println(info.substring(15,17)); // 18
		
		String info2 = "[name=세종대왕, age=3]";
		System.out.println(info2.substring(6,10));
		String info3 = "[name=SamSmith, age=3]";
		System.out.println(info3.substring(6,14));
		
		Student student = new Student("홍길동", 18);
		Student student2 = new Student("세종대왕", 3);
		Student student3 = new Student("SamSmith", 3);
		System.out.println(student.getName());
		System.out.println(student2.getName());
		System.out.println(student3.getName());
	}

}



















