package ddit.chap06.sec02;

public class Car {
	private String company;
	private boolean isAuto;
	
	//생성자 객체 X => setter method (private 변수 꺼내서 외부로 보냄-통로 / 아니면 출력했을 때 null값만 출력)
	//개별 출력 아닌 이상 밑에 있으니까 getter 필요 없음
	public void setCompany(String company) {
		this.company = company;
	}

	public void setAuto(boolean isAuto) {
		this.isAuto = isAuto;
	}
	
	//print
	public void carInfo() {
		System.out.println("제조회사 : " + company); //자기 클래스니까 사용
		System.out.print("기어타입: ");
		if(isAuto) {
			System.out.println("Autometic");
		}else {
			System.out.println("Manual");
		}
	}

	
}
