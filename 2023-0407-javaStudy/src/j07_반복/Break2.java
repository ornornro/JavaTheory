package j07_반복;

public class Break2 {

	public static void main(String[] args) {
		// 커피자판기
		int coffee = 10;
		int money = 1000;
		
		while(money > 0) {
			int i = money / 300;
			int j = 0;
			while(j < i) {
				System.out.println("커피를 줍니다.");
				coffee--;
				if(coffee == 0) {
					System.out.println("판매를 중지합니다.");
					break;
				}
				j++;
			}
			
		}
		// break -> 멈추고 반복을 빠져 나옴. 하나의 반복만 빠져나옴!!!
	}

}








