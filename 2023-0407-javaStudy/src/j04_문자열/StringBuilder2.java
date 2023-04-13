package j04_문자열;

public class StringBuilder2 {

	public static void main(String[] args) {
		String names = "정정빈님, 이태훈님, 이상현님, 윤미소님";
		StringBuilder stringBuilder = new StringBuilder();
		// StringBuilder를 사용하여 아래와 같이 출력이 되게 하시오.
		// 결과물 : 정정빈/이태훈/이상현/윤미소
		//풀이1
//		stringBuilder.append(names.substring(0, 3));
//		stringBuilder.append("/");
//		stringBuilder.append(names.substring(6, 9));
//		stringBuilder.append("/");
//		stringBuilder.append(names.substring(12, 15));
//		stringBuilder.append("/");
//		stringBuilder.append(names.substring(18, 21));
//		
//		System.out.println(stringBuilder);
//		
//		String names2 = "최연호님, 최연일님, 최연이님";
//		int index = names2.indexOf("님");
//		System.out.println(index);
//		int index2 = names2.indexOf("님", 4);
//		System.out.println(index2);
		
		//풀이2
		int index = names.indexOf("님");
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
		index = names.indexOf("님", index + 1);
		System.out.println(stringBuilder);
		
		StringBuilder stringBuilder2 = new StringBuilder();
		stringBuilder2.append(names);
		
//		작성
		int index2;
		index2 = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index2, index2 + 3);
		
		index2 = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index2, index2 + 3);
		
		index2 = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index2, index2 + 3);
		
		index2 = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index2, index2 + 3);
		
		System.out.println(stringBuilder2);
//		정정빈이태훈이상현윤미소
		
		

		
		
	}

}












