package ddit.chap06.sec01;

public class CircleExample {
//예제 1. 실수형 반지름(radius)과 원주율(PI)을 멤버 필드로 갖고 있는 원 클래스(Circle) 생성

	public static void main(String[] args) {
		Circle c = new Circle(900);
		System.out.println("반지름3: " + c.radius); //900.0
		
		System.out.print("원의 넓이: ");
		System.out.println(c.radius01(c.radius));
		System.out.print("원의 둘레: ");
		System.out.print(c.radius02(c.radius));
	}

}

//default
class Circle {
	//반지름 집어넣지 않고 생성한 거
	//변수 만들기
	double radius=10.0; //직접초기화
	//상수 만들기
	//고정된 값 => 변수 필요없음
	final double PI = 3.1415926;  //2)new 연산자 실행 !초기화블록 실행 전 !
	{//2-1)초기화블록- 잘 사용 안함 >> 일률적으로 값 낼 때만
		System.out.println("반지릅1: " + radius); //10.0
		radius = 50.5; //heap에 다시 저장
	}
	Circle(){}
	//3)Circle(900) 실행
	Circle(double r) {  //radius => Circle method 지역변수
		System.out.println("반지릅2: " + this.radius); // 900말고 50.5 가져올 수 있음
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
