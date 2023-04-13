package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson3 {

	public static void main(String[] args) {
		
		User2 user2 = UserService2.createUser2();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String userJson = gson.toJson(user2);
		
		System.out.println(userJson);
		
		User2 userObj2 = gson.fromJson(userJson, User2.class);
		
		System.out.println(userObj2);
		
	}

}
