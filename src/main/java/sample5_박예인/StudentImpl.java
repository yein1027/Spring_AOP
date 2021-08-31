package sample5_박예인;

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
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("학년:"+gradeNum);
		System.out.println("반:"+classNum);		
	}
}
