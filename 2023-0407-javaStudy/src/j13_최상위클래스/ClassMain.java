package j13_최상위클래스;

import java.lang.reflect.Method;

public class ClassMain {

	public static void main(String[] args) {
		Student student = new Student(20230001, "홍길동");
		
		Class c = student.getClass();
		
		System.out.println("클래스명(모든 경로 포함): " + c.getName());
		System.out.println("클래스명(클래스명만): " + c.getSimpleName());
		
		Method[] methods = c.getMethods();
		
		/*
		 * methods 를 반복돌려 메소드들의 이름 출력
		 */
		
		for(int i = 0; i < methods.length; i++) {
			System.out.println(methods[i].getName());
		}
	}

}













