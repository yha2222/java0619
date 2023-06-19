package ddit.chap06.sec01;
//���� 2. �����ȣ(���ڿ�), �����(���ڿ�), �ҼӺμ��ڵ�(������), �޿�(������) ������ ���� �ִ� ���Ŭ���� ����
public class EmployeeVO {
	private String empId;
	private String empName;
	private int deptId;
	private int salary;
	
	//EmployeeVO(){}
	EmployeeVO(String empId, String empName, int deptId, int salary) {
		this.empId = empId;
		//this.=>�ڱ��ڽ� Ŭ���� �ּ�, Ư�� ������ ����
		//this() => ������ �޼ҵ� �ȿ����� �� �� ����
		// super => �θ� Ŭ������ ������ �޼ҵ� ȣ��
		this.empName = empName;
		this.deptId = deptId;
		this.salary = salary;
		//�ʱ�ȭ
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
	//toString=>�ּҰ����� ��ȯ���� �� �������ϰڴ�
	//toString - �ϰ��� ������ <-> ������ ��ȯ, �ܺο��� ���� => getter, setter => �����ؾߵǴ� ��ġ�� Ŀ��
	public String toString() {
		//��ȯ�� ���� �� ���ο� �ݵ�� return��
		return "�����ȣ : " + empId + "\n�����: " + empName + "\n�μ��ڵ�: "
				+ deptId + "\n�޿�" + salary;
	}
}

