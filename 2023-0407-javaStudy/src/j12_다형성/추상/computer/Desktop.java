package j12_다형성.추상.computer;

public abstract class Desktop extends Computer{
	
	@Override
	public void onKeyPress() {
		System.out.println("컴퓨터의 키보드 입력을 받습니다.");
	}
	
	@Override
	public void onSound() {
		System.out.print("컴퓨터에서 ");
		super.onSound();
	}
	
	public abstract void onMouseClick();
	
}
