package j11_상속;

public class Human extends Animal{
	
	public Human() {
		System.out.println("Human 객체 생성");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	// 오버라이드 : 재정의
	// @ -> 어노테이션이라고 읽음.

}










