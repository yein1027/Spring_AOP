package sample5_�ڿ���;

public class StudentImpl implements Student {

	private String name;
	private int age;
	private int gradeNum;
	private int classNum;
	
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGradeNum(int gradeNum) {
		this.gradeNum = gradeNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}


	@Override
	public void getStudentInfo() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
		System.out.println("�г�:"+gradeNum);
		System.out.println("��:"+classNum);		
	}
}
