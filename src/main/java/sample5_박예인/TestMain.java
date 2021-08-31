package sample5_박예인;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		/*
		Start s = new Start();
		Hello h = new Hello();
		End e = new End();
		Goodbye gb = new Goodbye();
		
		StudentImpl stu = new StudentImpl();
		stu.setName("아무개");
		stu.setAge(20);
		stu.setClassNum(11);
		stu.setGradeNum(2);
		
		s.start();
		h.hello();
		stu.getStudentInfo();
		e.end();
		
		System.out.println("--------------");
		
		WorkerImpl wor = new WorkerImpl();
		wor.setName("홍길동");
		wor.setAge(40);
		wor.setJob("학생");
		
		s.start();
		wor.getWorkerInfo();
		gb.goodbye();
		e.end();
		*/
		
		ApplicationContext factory = new GenericXmlApplicationContext("classpath:sample5Study.xml");
		Student stu = (Student)factory.getBean("sd");
			
		stu.getStudentInfo();
		
		System.out.println("---------------------");
		
		Worker wor =(Worker)factory.getBean("wk");
		wor.getWorkerInfo();
	}

}


/*
출근합니다.
안녕하세요.
이름:아무개
나이:20
학년:2
반:11
퇴근합니다.
--------------
출근합니다.
이름:홍길동
나이:40
직업:학생
안녕히 계세요.
퇴근합니다.

*/
