package ddit.chap06.sec03;
//�䱸����1.�ڵ��� Ŭ���� ����
//�ڵ��� Ŭ������ ����(gas)�Ӽ��� ������ ������ �ܺο��� ������ �� ����
//����� �ʿ��� �� ������ �� ������(setter)
//���� ���Ḧ Ȯ���� �� �ִ� ����� ��ư(Empty method <= gas����)�� �ִ�
//�ڵ����� ���ᰡ ���������� ������ �� �ְ� ������ ������ ���ᷮ�� ������ ���ҵǾ�(gasŸ�� ������)
//���� ���� ���� ������ ������ �� ����.(�ܺο��� Ȯ���� �� ����)
public class Car {
	private int gas;

	public void setGas(int gas) {
		this.gas = gas;
	}
	
	public boolean empty() {
		if(this.gas > 0) {
			System.out.println("���� ���ᷮ�� " + this.gas +"�Դϴ�.");
			return true;
		}else {
			System.out.println("���� �Ұ�");
			return false;
		}
	}
	
	public void run() {
		while(empty()) {
			gas--;
		}
	}
	
	
	
//	public void empty() {
//		System.out.println("���� ���ᷮ: " + this.gas);
//	}
//	
//	public int run(int gas) {
//		this.gas -= gas;
//		if(this.gas > 0) {
//			System.out.println("���డ��");
//		}else {
//			System.out.println("����Ұ���");
//		}
//		return gas;
//	}
}