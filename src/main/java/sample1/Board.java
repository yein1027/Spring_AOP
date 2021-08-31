package sample1;

public class Board {
	
	public void board() {
	
		String msg="게시물 등록";
		
		
		System.out.println(msg+"을 위한 로그인 수행"); //공통 기능(Aspect)
		System.out.println(msg+"하기"); //핵심기능
		System.out.println(msg+"을 DB에 저장"); //공통 기능
		System.out.println(msg+"을 위한 로그아웃 수행"); //공통 기능
	}
}
//생성자는 클래스와 이름이 같은 메서드=대소문자 똑같고 return 타입 없어야 함(void 없어야 함)
