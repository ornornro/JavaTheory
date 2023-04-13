package j17_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("java");
		
		set.add("python");
		set.add("python");
		set.add("python");
		set.add("python");
		
		set.add("1");
		set.add("2");
		
		System.out.println(set);
		
		Iterator<String> ir = set.iterator();
		
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
		
		/*
		 * 반복문을 돌려 만약 요솟값이 java이면
		 * 그 요솟값을 출력
		 * 
		 */
		while(ir.hasNext()) {
			String str = ir.next();
			if(str.equals("java")) {
				System.out.println(str);
			}
		}
		
		
	}

}
















