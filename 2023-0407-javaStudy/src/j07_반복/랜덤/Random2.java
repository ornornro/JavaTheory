package j07_반복.랜덤;

import java.util.Random;

public class Random2 {

	public static void main(String[] args) {
		/*
		 * Random 클래스
		 */
		
		Random random = new Random();
		System.out.println(random.nextInt(10));
		// 0 ~ 9 까지의 수를 랜덤하게 뽑아줌.
		System.out.println();
		
		int i = 0;
		while(i < 6) {
			int rNum = random.nextInt(45) + 1;
			System.out.println(rNum);
			i++;
		}
		
		/*
		 * a, b, c, d, e, f
		 * [1, 30, 40]
		 */
		
		
	}

}









