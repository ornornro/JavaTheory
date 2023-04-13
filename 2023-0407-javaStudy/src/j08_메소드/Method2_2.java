package j08_메소드;

public class Method2_2 {
	public static String sum(int num) {
		for(int i = 0; i < num; i++) {
			System.out.println("홍길동");
		}
		
		return "종료합니다.";
	}
	
	public static void sum(String num) {
		System.out.println("잘못입력하셨습니다.");
	}
	

	public static void main(String[] args) {
		sum(5);
		System.out.println();
		System.out.println(sum(3));
		
		sum("5");
		
		/*
		 * sum(5);
		 * 홍길동
		 * 홍길동
		 * 홍길동
		 * 홍길동
		 * 홍길동
		 * 
		 * System.out.println(sum(3));
		 * 홍길동
		 * 홍길동
		 * 홍길동
		 * 종료합니다.
		 * 
		 */
	}

}
