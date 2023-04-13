package j15_스태틱.싱글톤;

public class SingletonMain {

	public static void main(String[] args) {
		
		KIA kia = KIA.getInstance();
		kia.produceCar("k3");
		
//		System.out.println(kia.produceCar("k3"));
//		
//		System.out.println(kia.produceCar("k5"));
//		System.out.println(kia.produceCar("k5"));
//		System.out.println(kia.produceCar("k5"));
//		System.out.println(kia.produceCar("k5"));
//		System.out.println(kia.produceCar("k5"));
//		System.out.println(kia.produceCar("k5"));
//		System.out.println(kia.produceCar("k5"));
//		System.out.println(kia.produceCar("k5"));
//		System.out.println(kia.produceCar("k5"));
//		System.out.println(kia.produceCar("k5"));
		
		KIA kia2 = KIA.getInstance();
		KIA kia3 = KIA.getInstance();
		KIA kia4 = KIA.getInstance();
		
		System.out.println(kia2);
		System.out.println(kia3);
		
		
	}

}

















