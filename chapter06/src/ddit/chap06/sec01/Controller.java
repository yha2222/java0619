package ddit.chap06.sec01;

public class Controller {

	public static void main(String[] args) {
		new Controller().init();
	}
	public void init() {
		EmployeeVO empVO = new EmployeeVO("R230101", "�ڱ浿", 30, 50000);
		//empVO - �ν��Ͻ� ����	<= ȣ�� ���� �������� ����
		System.out.println(empVO); 
		//(empVO(.toString())); - ���� Object class ��� => ����ϸ� 16������ ǥ���� �ּҰ�(heap) ����
		
		empVO.setDeptId(50);
		System.out.println(empVO.toString());
	}

}
