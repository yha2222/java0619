package ddit.chap06.sec01;

public class CircleExample {
//���� 1. �Ǽ��� ������(radius)�� ������(PI)�� ��� �ʵ�� ���� �ִ� �� Ŭ����(Circle) ����

	public static void main(String[] args) {
		Circle c = new Circle(900);
		System.out.println("������3: " + c.radius); //900.0
		
		System.out.print("���� ����: ");
		System.out.println(c.radius01(c.radius));
		System.out.print("���� �ѷ�: ");
		System.out.print(c.radius02(c.radius));
	}

}

//default
class Circle {
	//������ ������� �ʰ� ������ ��
	//���� �����
	double radius=10.0; //�����ʱ�ȭ
	//��� �����
	//������ �� => ���� �ʿ����
	final double PI = 3.1415926;  //2)new ������ ���� !�ʱ�ȭ��� ���� �� !
	{//2-1)�ʱ�ȭ���- �� ��� ���� >> �Ϸ������� �� �� ����
		System.out.println("������1: " + radius); //10.0
		radius = 50.5; //heap�� �ٽ� ����
	}
	Circle(){}
	//3)Circle(900) ����
	Circle(double r) {  //radius => Circle method ��������
		System.out.println("������2: " + this.radius); // 900���� 50.5 ������ �� ����
		this.radius = r; //heap => 900.0
	}
	
	double radius01(double round){
		double rou = (round*2)/PI;
		return rou;
	}
	
	double radius02(double rad) {
		double cal = rad*rad*PI;
		return cal;
	}
}
