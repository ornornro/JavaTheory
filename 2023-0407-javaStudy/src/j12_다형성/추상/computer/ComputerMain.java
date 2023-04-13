package j12_다형성.추상.computer;

public class ComputerMain {

	public static void main(String[] args) {
		Computer c1 = new Laptop();
		Computer c2 = new DesktopImpl();
		
		c1.onKeyPress();
		c1.onDisplay();
		
		((Desktop)c2).onMouseClick();
		c2.onKeyPress();
		c2.onDisplay();
		
		c1.onSound();
		c2.onSound();
		
	}

}
