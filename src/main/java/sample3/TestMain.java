package sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
		AbstractApplicationContext factory = 
				new FileSystemXmlApplicationContext("classpath:aopExam.xml");
		
		BoardImpl br = (BoardImpl)factory.getBean("bi"); //이렇게 하면 다운캐스팅 안 해도 ㅇㅋ
		br.board(); //board의 핵심 기능만 호출
	}
}
