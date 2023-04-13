package j07_반복;

public class For3 {

	public static void main(String[] args) {
		/*
		 * str = abcdefghijk
		 * 
		 * a
		 * b
		 * c
		 * d
		 * e
		 * f
		 * g
		 * h
		 * i
		 * j
		 * k
		 * 
		 * 
		 */
		String str2 = "홍길동ab12";
		System.out.println(str2.length());
		
		
		String str = "abcdefghijkvjhvjhvhj";
//		System.out.println(str.substring(2, 4));
		for(int i = 0; i < str.length(); i++) {
			String substr = str.substring(i, i + 1);
			System.out.println(substr);
		}
		
	}

}













