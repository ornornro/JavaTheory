package j12_다형성.인터페이스;

public class Computer {
	
	private HDMI hdmi;
	
	
	public Computer(HDMI hdmi) {
		this.hdmi = hdmi;
	}

	public void powerOn() {
		System.out.println("컴퓨터의 전원을 켭니다.");
		connectDisplay();
	}
	
	public void powerOff() {
		disConnectedDisplay();
		System.out.println("컴퓨터의 전원을 끕니다.");
	}
	
	private void connectDisplay() {
		System.out.println("출력 장치를 연결합니다.");
		hdmi.connect();
	}
	
	private void disConnectedDisplay() {
		System.out.println("출력 장치 연결을 해제합니다.");
		hdmi.disConnect();
	}
}












