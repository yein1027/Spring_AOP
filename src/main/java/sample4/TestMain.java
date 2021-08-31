package sample4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
  
public class TestMain {
	public static void main(String[] args) {
		
		AbstractApplicationContext factory = 
				new FileSystemXmlApplicationContext("classpath:aopExam.xml"); // classpath: �� ���� ���� 
		 
		System.out.println();		
		Board bd = (Board)factory.getBean("bd") ;
		bd.board();		//�길 ȣ���ص� aopExam�� �����ص� �� ������ login�� ��µȴ�
		
		System.out.println();
		
		Order myorder = (Order)factory.getBean("myorder");
		myorder.order();
	}
}
