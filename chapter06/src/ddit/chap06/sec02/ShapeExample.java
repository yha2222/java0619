package ddit.chap06.sec02;

public class ShapeExample {

	public static void main(String[] args) {
		Shape s1 = new Shape("Ÿ����", new Point(100, 100));
		System.out.println(s1);
		
		s1.shapeKind = "��";
		s1.point=new Point(300,500);
		System.out.println(s1);
		
		Shape s2 = new Shape("�ﰢ��", new Point());
		System.out.println(s2);
	}

}
