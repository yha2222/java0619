package ddit.chap06.sec01;

public class ProductExample {
//���� 4. ��ǰ��ȣ(������)�� ������ ��ǰŬ���� �����ϰ� �� ��ü�� ������ ������ ��ǰ��ȣ�� 1�� �������Ѷ�
	public static void main(String[] args) {
		//Product p1= new Product();
		System.out.println("pid(P1) = "+ Product.pid);//Ŭ���������� ���� ���� ����
		Product p2= new Product();
		System.out.println("pid(P2) = "+ p2.pid);
		Product p3= new Product();
		System.out.println("pid(P3) = "+ p3.pid);
		//�� new �� ������ ������� �����Ǵµ� �ʱ�ȭ�� ���� �Ǵϱ� �׻� 1��....

	}

}

class Product{
	static int pid;
	//static + int pid; => �ʱ�ȭ �ȵż� �� ���� ���
	Product(){
		pid++;
	}
}
