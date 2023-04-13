//package j19_익명클래스.role;
//
//public class PrincipalMain {
//
//	public static void main(String[] args) {
//
//		User user = User.builder()
//				.username("hong")
//				.password("1234")
//				.roles("USER_ROLE, ADMIN_ROLE,MANAGE_ROLE")
//				.build();
//		
//		User user2 = User.builder()
//				.username("dongbin")
//				.password("1234")
//				.roles("USER_ROLE")
//				.build();
//		
//		PrincipalDetails principalDetails = new PrincipalDetails(user);
//		PrincipalDetails principalDetails2 = new PrincipalDetails(user2);
//		
//		System.out.println(principalDetails);
//		System.out.println(principalDetails2);
//		
//	}
//	
//	public static void printPrincipalData(PrincipalDetails principalDetails) {
//		System.out.println("[principal 정보 출력!}");
//		
//		System.out.println("username: " + principalDetails.getUsername());
//		System.out.println("password: " + principalDetails.getPassword());
//		
//		for(GrantedAuthority grantedAuthority : principalDetails.getAuthorities()) {
//			System.out.println("권한" + grantedAuthority.getAuthorities());
//		}
//	}
//
//}
