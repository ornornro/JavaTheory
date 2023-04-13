package j08_메소드;

public class Method4 {
	public static String add(int a, int b) {
		System.out.println("계산이 완료되었습니다.");
		return "정답은" + (a + b) + "입니다.";
	}
	
	public static String add(int a, int b, int c) {
		System.out.println("계산이 완료되었습니다.");
		return "정답은" + (a + b + c) + "입니다.";
	}
	

	public static void main(String[] args) {
		add(1, 2);
		System.out.println(add(1, 2));
		System.out.println(add(1, 2, 3));
		
		/*
		 * add(1, 2);
		 * 계산이 완료되었습니다.
		 * 
		 * System.out.println(add(1, 2));
		 * 계산이 완료되었습니다.
		 * 정답은 3입니다.
		 * 
		 * add(1, 2, 3);
		 * 계산이 완료되었습니다.
		 * 
		 * System.out.println(add(1, 2, 3));
		 * 계산이 완료되었습니다.
		 * 정답은 6입니다.
		 */
		
		
	}

}
