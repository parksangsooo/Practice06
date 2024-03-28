package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		// Str 값 2개이기 때문에, Shape class > S2 = "생성자 Shape(2) 실행" + "================"
		
		Triangle t1 = new Triangle(); // 	기본 생성자
		System.out.println("================");
		
		// Str 값 없기 때문에, Shape class > S0 > T0  = "생성자 Shape(0) 실행" + "생성자 Triangle(0) 실행" + "================"
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		
		// Triangle > super sh
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
		
	}

}

