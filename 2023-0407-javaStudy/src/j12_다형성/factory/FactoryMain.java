package j12_다형성.factory;

import j11_상속.factory.Factory;
import j11_상속.factory.LGFactory;
import j11_상속.factory.SamsungFactory;

public class FactoryMain {

	public static void main(String[] args) {
		SamsungFactory samsungFactory = new SamsungFactory(1);
		LGFactory lgFactory = new LGFactory(1);
		
		FactoryService factoryService = new FactoryService(samsungFactory);
		
		factoryService.factoryStart();
		factoryService.factoryStop();
		
	}

}














