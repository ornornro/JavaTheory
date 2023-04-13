package j12_다형성2;

public class MessengerMiddleware {
	private Messenger messenger;

	public MessengerMiddleware(Messenger messenger) {
		this.messenger = messenger;
	}
	
	public void sendMessage() {
		messenger.send();
	}
	
	public void receiveMessage() {
		messenger.receive();
	}
	
	public void runAddOns() {
		if(messenger instanceof KakaoTalk) {
//			KakaoTalk kakaoTalk = (KakaoTalk)messenger;
//			kakaoTalk.sendPresent();
			((KakaoTalk)messenger).sendPresent();
		}else if(messenger instanceof FacebookMessenger) {
			((FacebookMessenger)messenger).call();
		}else {
			System.out.println("지원하지 않는 기능입니다.");
		}
	}
	
	
	
	
}










