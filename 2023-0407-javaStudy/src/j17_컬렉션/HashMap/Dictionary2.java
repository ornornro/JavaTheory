//package j17_컬렉션.HashMap;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Dictionary2 {
//
//	public static void main(String[] args) {
//
//		/*
//		 * 축구 -> soccer
//		 * 야구 -> baseball
//		 * 농구 -> basketball
//		 * 골프 -> golf
//		 */
//		
//		Map<String, Object> dict = new HashMap<String, Object>();
//		dict.put("축구", "soccer");
//		dict.put("야구", "baseball");
//		dict.put("농구", "basketball");
//		dict.put("골프", "golf");
//		
//		Scanner scanner = new Scanner(System.in);
//		String search = null;
//		
//		while(true) {
//			
//			System.out.println("[사전검색기능]");
//			System.out.println("#프로그램종료(q)");
//			
//			System.out.println("검색어 : ");
//			search = scanner.nextLine();
//			
//			if(search.equals("q") {
//				System.out.println("프로그램 종료!");
//				break;
//			}else if(dict.containsKey(search)) {
//				System.out.println(dict.get(search));
//			}else {
//				System.out.println("지원하지 않는 단어입니다!");
//			}
//			System.out.println();
//			
//		}
//
//	}
//
//}
