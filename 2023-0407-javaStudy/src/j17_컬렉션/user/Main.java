package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * {
		 * "no" = 1,
		 * "message" = "1page list",
		 * "data" = [
		 * 		{
		 * 			"name" = "최연호",
		 * 			"address" = "부산 진구",
		 * 			"contact" = "010-3300-4698",
		 * 			"sex" = 1
		 * 		},
		 * 		{
		 * 			"name" = "홍길동",
		 * 			"address" = "부산 서구",
		 * 			"contact" = "010-1111-1111",
		 * 			"sex" = 0
		 * 		}
		 * 		]
		 * }
		 */
		
		Map<String, Object> datamap = new HashMap<String, Object>();
		
		datamap.put("no", 1);
		datamap.put("message", "1page list");
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> infomap1 = new HashMap<String, Object>();
		infomap1.put("name", "최연호");
		infomap1.put("address", "부산 진구");
		infomap1.put("contact", "010-3300-4698");
		infomap1.put("sex", 1);
		
		Map<String, Object> infomap2 = new HashMap<String, Object>();
		infomap2.put("name", "홍길동");
		infomap2.put("address", "부산 서구");
		infomap2.put("contact", "010-1111-1111");
		infomap2.put("sex", 0);
		
		list.add(infomap1);
		list.add(infomap2);
		
		datamap.put("data", list);
		
		System.out.println(datamap);
		
	}

}
