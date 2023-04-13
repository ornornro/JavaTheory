package j08_메소드;

public class Method3 {
	/*
	 * 메소드 오버로딩(Overloading)
	 * : 매개변수의 형태가 다르면 동일한 메소드명을 사용해서 메소드를 정의할
	 *   수 있다.
	 */
	
	public static void test1() {
		System.out.println("매개변수가 없는 test1");
	}
	
	public static void test1(int num1) {
		System.out.println("매개변수가 하나이고 int자료형인 test1");
	}
	
	public static void test1(int num1, int num2) {
		System.out.println("매개변수가 두개이고 둘다 int자료형인 test1");
	}
	
	public static void test1(String a, int num) {
		System.out.println("매개변수 두개이고 앞은 문자열, 뒤는 정수");
	}
	
	
	

	public static void main(String[] args) {
		test1();
		test1(10);
		test1(10, 20);
		test1("10", 20);
		
	}

}










