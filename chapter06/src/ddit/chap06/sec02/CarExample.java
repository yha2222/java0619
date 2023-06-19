package ddit.chap06.sec02;

public class CarExample {

	public static void main(String[] args) {
		//overload => 다양한 데이터 취급 
		//이름 같은 메소드 같은 클래스 내에 하나 이상 존재 가능 메소드 => 매개 변수 - 개수/타입 / 다른 배열 상태(int-float=>X)
		//생성자 메소드도 사용
		//대표:this메소드=> this() => 생성자 메서드의 첫번째 문장이어야 함, 꼭 써야되는 건X, 목적:다른 생성자 메서드 호출
		//각 생성자 메서드에서 각 필드에 할당한 코드 중복 피해서 한군데로 모아서 배정가능 => 잘 안 씀..
		//없으면 컴파일러가 기본 생성자 만듦(매개변수X)
		Car car1 = new Car();
		car1.setCompany("KIA 자동차");
		car1.setAuto(true);
		car1.carInfo(); //boolean 초기화 => false
	}

}
