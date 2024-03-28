package com.javaex.ex02;

public class Triangle extends Shape{
	 // 필드생성
	private int width;
	private int height;
	
	
	//생성자
	public Triangle() { // 기본 생성자
		// 여기서 super 부르지 않았기 때문에, 기본적으로 부모 기본 생성자 호출 super();
		System.out.println("생성자 Triangle(0) 실행"); //T0
	}
	
	//파라미터 2개짜리 생성자
	public Triangle(int width, int height) {  //T2
		super("검정","빨강"); // 초기화 하고 호출. 기본생성자 불러
//		super(); // 부모안에 생성자 호출
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(2) 실행");
	}
	
	//파라미터 4개짜리 생성자
	public Triangle(String fillColor, String lineColor, int width, int height) { // T4
		super(fillColor,lineColor); // 	부모 초기화
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(4) 실행");
	}
	
	
	
}


