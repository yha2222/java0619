package ddit.chap06.sec03;
//�䱸����1.�ڵ��� Ŭ���� ����
//		   �ڵ��� Ŭ������ ����(gas)�Ӽ��� ������ ������ �ܺο��� ������ �� ����
//		   ����� �ʿ��� �� ������ �� ������(setter) ���� ���Ḧ Ȯ���� �� �ִ� ����� ��ư(Empty method <= gas����)�� �ִ�
//		   �ڵ����� ���ᰡ ���������� ������ �� �ְ� ������ ������ ���ᷮ�� ������ ���ҵǾ�(gasŸ�� ������)
//		   ���� ���� ���� ������ ������ �� ����.(�ܺο��� Ȯ���� �� ����)
public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.printInfo();
		Person p2 = new Person("�̻���");
		p2.printInfo();
	}

}
