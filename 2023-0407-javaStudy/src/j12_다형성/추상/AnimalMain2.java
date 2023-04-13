package j12_다형성.추상;

public class AnimalMain2 {

	public static void main(String[] args) {
		Animal2 animal2 = new Human2();
		animal2.attack();
		((Human2)animal2).love();
	}

}
