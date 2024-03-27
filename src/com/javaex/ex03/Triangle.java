package com.javaex.ex03;

public class Triangle extends Shape{
	
	private int width;
	private int height;
	
	public Triangle(int width, int height) {
		// 왜냐면 기본생성자를 자동 으로 불러오는데, 엄마에 기본생성자가 없어
		this.width = width;
		this.height = height;
	}
	
	public void showInfo() {
		System.out.println("====삼각형====");
		System.out.println("#면색:"+fillColor);
		System.out.println("#선색:"+lineColor);
		System.out.println("#가로:"+width);
		System.out.println("#세로:"+height);
	}
}





