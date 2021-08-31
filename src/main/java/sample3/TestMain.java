package sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
		AbstractApplicationContext factory = 
				new FileSystemXmlApplicationContext("classpath:aopExam.xml");
		
		BoardImpl br = (BoardImpl)factory.getBean("bi"); //�̷��� �ϸ� �ٿ�ĳ���� �� �ص� ����
		br.board(); //board�� �ٽ� ��ɸ� ȣ��
	}
}
