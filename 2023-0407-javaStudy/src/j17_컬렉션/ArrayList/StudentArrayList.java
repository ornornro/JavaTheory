package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import j15_스태틱.Student;

public class StudentArrayList {

	public static void main(String[] args) {
		Student student1 = new Student("홍길동");
		Student student2 = new Student("구민근");
		Student student3 = new Student("신동욱");
		Student student4 = new Student("윤미소");
		Student student5 = new Student("정영규");
		
		/*
		 * 실습!
		 * 위에 학생 객체를 담을 수 있는 배열 생성
		 * (배열이름 : students)
		 * 
		 * ArrayList 생성하여 위에 배열을 리스트로 바꾸고 추가
		 * 
		 */
		Student[] students = {student1, student2, student3, student4, student5};
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.addAll(Arrays.asList(students));
		
		System.out.println(studentList);
		
		for(Student student : studentList) {
			System.out.println();
			System.out.println(student);
		}
		
		/*
		 * 반복을 돌려서 "신동욱"을 찾고
		 * 찾았으면 신동욱 출력하고
		 * 객체 삭제
		 */
		
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getName().equals("신동욱")) {
				System.out.println(studentList.get(i).getName());
				studentList.remove(i);
			}
		}
		System.out.println(studentList);
		
		for(Student student : studentList) {
			if(student.getName().equals("윤미소")) {
				System.out.println(student.getName());
				studentList.remove(student);
			}
		}
		System.out.println(studentList);
		
	}

}















