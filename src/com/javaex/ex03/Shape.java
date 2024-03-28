package com.javaex.ex03;

public class Shape {
	
	protected String fillColor;
	protected String lineColor;
	
	// 생성자 선언하지 않으면 기본 생성자를 자동으로 추가한다.
	// 임의로 생성자를 선언하면 기본 생성자를 자동으로 추가하지 않는다.
	
	public Shape() {
		
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	
}


