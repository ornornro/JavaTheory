package j08_메소드;

public class Method3_2 {
	/*
	 * 메소드 오버로딩(Overloading)
	 * : 매개변수의 형태가 다르면 동일한 메소드명을 사용해서 메소드를 정의할
	 *   수 있다.
	 */
	
	public static int sub(int a, int b) {
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		return a - b;
	}
	
	public static int sub(int num, String num2) {
		System.out.println(num2);
		System.out.println(num);
		return num;
	}

	public static void main(String[] args) {
		sub(10, 6);
		System.out.println(sub(5, 2));
		
	}

}










