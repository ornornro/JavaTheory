package j07_반복;

public class Continue1_1 {

	public static void main(String[] args) {
		/*
		 * 1부터 100까지 수 중 홀수의 합을 구하시오
		 * * continue 사용할것
		 */
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			int j = i + 1;
			if(j % 2 == 0) {
				continue;
			}
			sum += j;			
		}
		System.out.println("홀수의 합 : " + sum);
		
		
	}

}
