package ddit.chap06.sec02;

public class CarExample {

	public static void main(String[] args) {
		//overload => �پ��� ������ ��� 
		//�̸� ���� �޼ҵ� ���� Ŭ���� ���� �ϳ� �̻� ���� ���� �޼ҵ� => �Ű� ���� - ����/Ÿ�� / �ٸ� �迭 ����(int-float=>X)
		//������ �޼ҵ嵵 ���
		//��ǥ:this�޼ҵ�=> this() => ������ �޼����� ù��° �����̾�� ��, �� ��ߵǴ� ��X, ����:�ٸ� ������ �޼��� ȣ��
		//�� ������ �޼��忡�� �� �ʵ忡 �Ҵ��� �ڵ� �ߺ� ���ؼ� �ѱ����� ��Ƽ� �������� => �� �� ��..
		//������ �����Ϸ��� �⺻ ������ ����(�Ű�����X)
		Car car1 = new Car();
		car1.setCompany("KIA �ڵ���");
		car1.setAuto(true);
		car1.carInfo(); //boolean �ʱ�ȭ => false
	}

}
