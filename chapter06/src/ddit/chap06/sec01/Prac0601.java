package ddit.chap06.sec01;

public class Prac0601 {

	public static void main(String[] args) {
		Circle c = new Circle(900);
		System.out.println("반지름: " + c.radius);
		
		System.out.print("원넓이: ");
		System.out.println(c.radius01(c.radius));

	}

}

class Circle1 {
	double radius = 10.0;
	final double PI = 3.1415926;
	{
		radius = 50.5;
	}
	
	Circle1(){}
	
	Circle1(double rad) {
		this.radius = rad;
		System.out.println("반지름: "+ rad);
	}
	
	double radius01(double rad) {
		double r = (rad*2)/PI;
		return r;
	}
	
	double radius02(double rad) {
		double ra = rad*rad*PI;
		return ra;
	}
}
