package sample1;

public class Order {
	public void order() {
		
		String msg="상품 주문";
		
		//공통 기능
		System.out.println(msg+"을 위한 로그인 수행"); //공통 기능
		System.out.println(msg+"하기");//핵심 기능
		System.out.println(msg+"을 DB에 저장"); //공통 기능
		System.out.println(msg+"을 위한 로그아웃 수행"); //공통 기능
	}
}
