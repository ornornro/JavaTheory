package j07_반복;

public class WhileQna {

	public static void main(String[] args) {
		int i = 0;
		while(i < 3) {
			System.out.println("i = " + i);
			int j = 0;
			
			while(j < 5) {
				System.out.println("\tj = " + j);
				j++;
			}
			System.out.println("다음 반복 가기전 i 값 : " + i);
			i++;
						
		}
	}

}
