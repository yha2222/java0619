package ddit.chap06.sec01;

public class ProductExample {
//예제 4. 제품번호(정수형)를 보유한 제품클래스 생성하고 각 객체가 생성될 때마다 제품번호를 1씩 증가시켜라
	public static void main(String[] args) {
		//Product p1= new Product();
		System.out.println("pid(P1) = "+ Product.pid);//클래스명으로 직접 참고 가능
		Product p2= new Product();
		System.out.println("pid(P2) = "+ p2.pid);
		Product p3= new Product();
		System.out.println("pid(P3) = "+ p3.pid);
		//값 new 쓸 때마다 저장공간 생성되는데 초기화도 같이 되니까 항상 1임....

	}

}

class Product{
	static int pid;
	//static + int pid; => 초기화 안돼서 값 증가 출력
	Product(){
		pid++;
	}
}
