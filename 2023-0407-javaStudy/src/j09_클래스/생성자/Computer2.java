package j09_클래스.생성자;

public class Computer2 {
	int year;
	String company;
	String cpu;
	int ram;
	String graphic;
	
	public Computer2(int year,String company,String cpu,int ram,String graphic) {
		this.year = year;
		this.company = company;
		this.cpu = cpu;
		this.ram = ram;
		this.graphic = graphic;
	}
	
	void showInfo() {
		System.out.println("제조년 : " + year);
		System.out.println("제조사 : " + company);
		System.out.println("CPU : " + cpu);
		System.out.println("RAM : " + ram);
		System.out.println("GraphicCard : " + graphic);
	}
}
