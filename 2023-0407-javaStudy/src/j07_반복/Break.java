package j07_반복;

public class Break {

	public static void main(String[] args) {
		// 커피자판기
		int coffee = 10;
		int money = 1000;
		
		while(money > 0) {
			System.out.println("돈을 받았으니 커피를 줍니다.");
			coffee--;
			System.out.println("남은 커피의 양은 " + coffee + "입니다");
			if(coffee == 0) {
				System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
				break;
			}
			
		}
	}

}
