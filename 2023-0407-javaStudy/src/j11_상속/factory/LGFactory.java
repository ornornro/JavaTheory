package j11_상속.factory;

public class LGFactory extends Factory{

	public LGFactory(int factoryNumber) {
		super(factoryNumber);
	}
	
	@Override
	public void start() {
		System.out.print("엘지");
		super.start();
	}
	
	@Override
	public void stop() {
		System.out.print("엘지");
		super.stop();
	}
	
	public void produceSmartTV() {
		System.out.println("LG 스마트TV를 제작합니다.");
	}

}


















