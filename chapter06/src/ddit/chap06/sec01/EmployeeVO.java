package ddit.chap06.sec01;
//예제 2. 사원번호(문자열), 사원명(문자열), 소속부서코드(정수형), 급여(정수형) 정보를 갖고 있는 사원클래스 생성
public class EmployeeVO {
	private String empId;
	private String empName;
	private int deptId;
	private int salary;
	
	//EmployeeVO(){}
	EmployeeVO(String empId, String empName, int deptId, int salary) {
		this.empId = empId;
		//this.=>자기자신 클래스 주소, 특수 참조형 변수
		//this() => 생성자 메소드 안에서만 쓸 수 있음
		// super => 부모 클래스의 생성자 메소드 호출
		this.empName = empName;
		this.deptId = deptId;
		this.salary = salary;
		//초기화
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	//toString=>주소값말고 반환받을 값 재정의하겠다
	//toString - 일괄적 데이터 <-> 개별값 반환, 외부에서 접근 => getter, setter => 존재해야되는 위치에 커서
	public String toString() {
		//반환값 있을 떈 내부에 반드시 return문
		return "사원번호 : " + empId + "\n사원명: " + empName + "\n부서코드: "
				+ deptId + "\n급여" + salary;
	}
}

