package sample4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
  
public class TestMain {
	public static void main(String[] args) {
		
		AbstractApplicationContext factory = 
				new FileSystemXmlApplicationContext("classpath:aopExam.xml"); // classpath: 는 생략 가능 
		 
		System.out.println();		
		Board bd = (Board)factory.getBean("bd") ;
		bd.board();		//얘만 호출해도 aopExam에 설정해둔 것 때문에 login도 출력된다
		
		System.out.println();
		
		Order myorder = (Order)factory.getBean("myorder");
		myorder.order();
	}
}
