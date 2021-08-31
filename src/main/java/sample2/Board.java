package sample2;

public class Board {
	
	public void board() {
	
		String msg="게시물 등록"; //게시물 등록하려면
		Login.login(msg); //static이니까 클래스 이름으로. 로그인하고
		System.out.println(msg+"하기"); //핵심기능. 게시물 썼으면
		Logout.logout(msg); //로그아웃
	}
}

//생성자는 클래스와 이름이 같은 메서드=대소문자 똑같고 return 타입 없어야 함(void 없어야 함)
