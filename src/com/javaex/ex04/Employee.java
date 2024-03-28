package com.javaex.ex04;

public class Employee extends User {

	//필드생성
	private int salary;
	
	// 기본 생성자
	public Employee() {
		
	}
	
	// 전체 생성자
	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);	// 부모먼저 초기화
		this.salary = salary;
	}
	
	// Getter & Setter - 내부필드 salary 에 관련
	
	public int getSalary() { 	// 내부필드 salary를 불러와서 외부로 보냄.
		return salary;
	}
	
	public void setSalary(int salary) {		// 외부에서 입력받은 salary를 내부 필드 salary에 셋팅.
		this.salary = salary;
	}
	
	// 메서드
	@Override
	public void showInfo() {
		System.out.printf("#아이디: %s, #패스워드: %s, #이름: %s, #월급: %,d\n",id,password,name,salary);
	}
	
}
