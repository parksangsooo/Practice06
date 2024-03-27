package com.javaex.ex02;

public class Triangle extends Shape{
	
	private int width;
	private int height;
	
	public Triangle() {
		System.out.println("생성자 Triangle(0) 실행"); //T0
	}
	
	public Triangle(int width, int height) {  //T2
		super("검정","검정"); // 초기화 하고 호출. 기본생성자 불러
//		super(); // 부모안에 생성자 호출
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(2) 실행");
	}
	
	public Triangle(String fillColor, String lineColor, int width, int height) { // T4
		super(fillColor,lineColor);
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(4) 실행");
	}
	
	
	
}


