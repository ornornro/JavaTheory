package j18_JSON;

public class UserService2 {


	public static User2 createUser2() {
		
		User2 user2 = User2.builder()
				.name("이동빈")
				.id("aaa")
				.password("1234")
				.email("aaa@gmail.com")
				.build();
		
		return user2;
		
	}

}
