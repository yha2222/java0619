package ddit.chap06.sec01;

public class Controller {

	public static void main(String[] args) {
		new Controller().init();
	}
	public void init() {
		EmployeeVO empVO = new EmployeeVO("R230101", "박길동", 30, 50000);
		//empVO - 인스턴스 변수	<= 호출 스택 영역에서 생성
		System.out.println(empVO); 
		//(empVO(.toString())); - 전부 Object class 상속 => 출력하면 16진수로 표현된 주소값(heap) 나옴
		
		empVO.setDeptId(50);
		System.out.println(empVO.toString());
	}

}
