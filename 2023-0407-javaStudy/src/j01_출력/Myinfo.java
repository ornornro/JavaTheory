package j01_출력;

public class Myinfo {

	public static void main(String[] args) {
		// ctrl + space -> 자동완성
		// sysout -> 출력문 자동완성
		char name1 = '홍';
		char name2 = '길';
		char name3 = '동';
		
		String name4 = "홍길동";
		
		int age = 19;
		String address = "부산 진구 코리아아이티";
		
		
		System.out.print("성 : ");
		System.out.println("홍");
		
		System.out.print("성 : ");
		System.out.println(name1);
		
		System.out.println("이름 : ");
		System.out.println(name1);
		System.out.println("" +name1 + name2 + name3);
		System.out.println();
		System.out.println(name4);
		
		System.out.print("나이 : ");
		System.out.println(age);
		System.out.print("주소 : ");
		System.out.println(address);
		
		
	}

}










