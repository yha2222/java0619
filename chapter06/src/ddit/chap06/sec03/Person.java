package ddit.chap06.sec03;

public class Person {
	String name;
	int age;
	String gender;
	String phoneNumber;
	
	Person(){
		this("ȫ�浿",30,"����","010-1234-5678");
	}
	
	Person(String name) {
		this(name, 25);
	}
	
	Person(String name, int age){
		this(name, age, "����");
	}
	
	Person(String name, int age, String gender){
		this(name, age, gender, "010-9999-8888");
	}
	
	Person(String name, int age, String gender, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}
	
	public void printInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("����: " + gender);
		System.out.println("��ȭ��ȣ: " + phoneNumber);
	}
}
