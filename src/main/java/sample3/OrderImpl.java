package sample3;

public class OrderImpl implements Order{

	@Override
	public void order() { //핵심 기능만
		String msg="상품 주문";
		System.out.println(msg+"하기");
	}

}
