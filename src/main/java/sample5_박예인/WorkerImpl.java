package sample5_�ڿ���;

public class WorkerImpl implements Worker {

	private String name;
	private int age;
	private String job;
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setJob(String job) {
		this.job = job;
	}


	@Override
	public void getWorkerInfo() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
		System.out.println("����:"+job);
		
	}

}
