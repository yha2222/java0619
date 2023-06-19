package ddit.chap06.sec02;

public class Shape {
	String shapeKind;
	Point point;
	
	public Shape(String shapeKind, Point point) {
		this.shapeKind=shapeKind;
		this.point=point;
	}
	
	//���� �μ�
	@Override
	public String toString() {
		return point +"��"+shapeKind;
	}
}

class Point {
	//Ŭ���� ������ ������ ����
	private int x;
	 private int y;
	 
	 public Point() {
		 x = 0;
		 y=0;
	 }
	 
	 //������ ���� => �ּҰ� ���� - ����� ���� �Է� �Ұ�
	 //�������� �ִ� �������� ������� ���� �Ұ�=> this.
	 public Point(int x, int y) {
		 this.x = x;
		 this.y = y;
	 }
	 
	 @Override
		public String toString() {
			return "������ ("+x+", "+y+")";
		}
}
