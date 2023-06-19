package ddit.chap06.sec02;

public class Shape {
	String shapeKind;
	Point point;
	
	public Shape(String shapeKind, Point point) {
		this.shapeKind=shapeKind;
		this.point=point;
	}
	
	//내용 인쇄
	@Override
	public String toString() {
		return point +"인"+shapeKind;
	}
}

class Point {
	//클래스 없어질 때까지 존재
	private int x;
	 private int y;
	 
	 public Point() {
		 x = 0;
		 y=0;
	 }
	 
	 //참조형 변수 => 주소값 가짐 - 사용자 직접 입력 불가
	 //지역변수 있는 지역에서 멤버변수 접근 불가=> this.
	 public Point(int x, int y) {
		 this.x = x;
		 this.y = y;
	 }
	 
	 @Override
		public String toString() {
			return "원점이 ("+x+", "+y+")";
		}
}
