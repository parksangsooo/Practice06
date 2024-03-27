package com.javaex.ex02;

public class Shape {
	
	private String fillColor;
	private String lineColor;
	
	public Shape() {
		System.out.println("생성자 Shape(0) 실행"); // S0
	}
	
	public Shape(String fillColor, String lineColor) { //S2
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		
		System.out.println("생성자 Shape(2) 실행");
	}

}

