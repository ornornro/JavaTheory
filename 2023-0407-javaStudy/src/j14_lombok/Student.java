package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Student {
	
	private final int studentCode;
	@NonNull
	private String name;
	private int studentYear;
	private int age;
	/*
	 * 1) 생성자
	 * 2) 겟터 셋터
	 * 3) toString
	 * 4) 해쉬코드
	 * 5) equals
	 */

	
	
	
}
