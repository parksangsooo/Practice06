package com.javaex.ex04;

public class Customer extends User { // User 클래스부터 상속(확장)

	// 필드 작성
	private int point;
	
	// 생성자 작성
	
	// 1. 기본생성자
	public Customer() {
		
	}
	
	// 2. id, password, name, point 설정
	public Customer (String id, String password, String name,int point) {
		// 부모 먼저 초기화
		super(id,password,name);
		this.point = point;
	}
	
	public int getPoint () { // 내부필드 뽑아내서 외부로 전달
		return point;
	}
	
	public void setPoint(int point) { // 외부로부터 파라미터 입력 받아서 내부 필터로 전달.
		this.point = point;
	}
	
	@Override
	public void showInfo() { 
	// id, password, name 필드를 protected 로 선언해서 Costomer 클래스에서 마음대로 접근 가능.
		System.out.printf("#아이디: %s, #패스워드: %s, #이름: %s, #포인트: %,d\n",id,password,name,point);	
	}

}
