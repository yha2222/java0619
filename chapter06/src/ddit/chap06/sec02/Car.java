package ddit.chap06.sec02;

public class Car {
	private String company;
	private boolean isAuto;
	
	//������ ��ü X => setter method (private ���� ������ �ܺη� ����-��� / �ƴϸ� ������� �� null���� ���)
	//���� ��� �ƴ� �̻� �ؿ� �����ϱ� getter �ʿ� ����
	public void setCompany(String company) {
		this.company = company;
	}

	public void setAuto(boolean isAuto) {
		this.isAuto = isAuto;
	}
	
	//print
	public void carInfo() {
		System.out.println("����ȸ�� : " + company); //�ڱ� Ŭ�����ϱ� ���
		System.out.print("���Ÿ��: ");
		if(isAuto) {
			System.out.println("Autometic");
		}else {
			System.out.println("Manual");
		}
	}

	
}
