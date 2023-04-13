package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONObject {

	public static void main(String[] args) {

		Map<String, Object> datamap = new HashMap<String, Object>();
		
		List<Map<String, String>> resultlist = new ArrayList<Map<String, String>>();
		
		Map<String, String> resultmap1 = new HashMap<String, String>();
		Map<String, String> resultmap2 = new HashMap<String, String>();
		Map<String, String> resultmap3 = new HashMap<String, String>();
		
		datamap.put("count", 1118);
		datamap.put("next", "http://1");
		datamap.put("previous", null);
		
		resultmap1.put("name", "bulbasaur");
		resultmap1.put("url", "http://2");
		
		resultmap2.put("name", "ivysaur");
		resultmap2.put("url", "http://3");
		
		resultmap3.put("name", "venusaur");
		resultmap3.put("url", "http://4");
		
		resultlist.add(resultmap1);
		resultlist.add(resultmap2);
		resultlist.add(resultmap3);
		
		datamap.put("results", resultlist);
		
		System.out.println(datamap);
		
	}

}
