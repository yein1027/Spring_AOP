package sample2;

public class Board {
	
	public void board() {
	
		String msg="�Խù� ���"; //�Խù� ����Ϸ���
		Login.login(msg); //static�̴ϱ� Ŭ���� �̸�����. �α����ϰ�
		System.out.println(msg+"�ϱ�"); //�ٽɱ��. �Խù� ������
		Logout.logout(msg); //�α׾ƿ�
	}
}

//�����ڴ� Ŭ������ �̸��� ���� �޼���=��ҹ��� �Ȱ��� return Ÿ�� ����� ��(void ����� ��)
