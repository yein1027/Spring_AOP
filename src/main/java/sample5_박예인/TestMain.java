package sample5_�ڿ���;

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
		stu.setName("�ƹ���");
		stu.setAge(20);
		stu.setClassNum(11);
		stu.setGradeNum(2);
		
		s.start();
		h.hello();
		stu.getStudentInfo();
		e.end();
		
		System.out.println("--------------");
		
		WorkerImpl wor = new WorkerImpl();
		wor.setName("ȫ�浿");
		wor.setAge(40);
		wor.setJob("�л�");
		
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
����մϴ�.
�ȳ��ϼ���.
�̸�:�ƹ���
����:20
�г�:2
��:11
����մϴ�.
--------------
����մϴ�.
�̸�:ȫ�浿
����:40
����:�л�
�ȳ��� �輼��.
����մϴ�.

*/
