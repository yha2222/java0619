package ddit.chap06.sec03;
//요구사항1.자동차 클래스 생성
//		   자동차 클래스는 연료(gas)속성을 가지고 있으며 외부에서 참조될 수 없다
//		   연료는 필요할 때 주입할 수 있으며(setter) 남은 연료를 확인할 수 있는 기능의 버튼(Empty method <= gas변수)도 있다
//		   자동차는 연료가 남아있으면 주행할 수 있고 주행할 때마다 연료량이 일정량 감소되어(gas타입 결정됨)
//		   연료 남아 있지 않으면 주행할 수 없다.(외부에서 확인할 수 있음)
public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.printInfo();
		Person p2 = new Person("이쁜이");
		p2.printInfo();
	}

}
