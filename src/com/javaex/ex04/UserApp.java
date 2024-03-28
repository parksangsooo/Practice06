package com.javaex.ex04;

import java.util.Scanner;

public class UserApp {

	public static void main(String[] args) {
		
		User[] userArray = new User[3];		// User 클래스와 하위 클래스를 모두 담을 수 있는 배열
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("회원 정보를 입력하세요: id, password, name");
		
		User u1 = new Customer("jws","1234","정우성", 1000);		// 고객
		User u2 = new Customer("yjs","y2345","이효리", 2000);		// 고객
		User u3 = new Employee("master","m7788","운영자", 5_000_000);		// 마스터
		
		// 세 명의 사용자 배열에 등록
		// 참조 자료형의 배열은 참조 객체의 주소가 할당.
		// 객체가 직접 들어가는 것은 아니다.
		
		userArray[0] = u1;
		userArray[1] = u2;
		userArray[2] = u3;
		
		 
		for (int i = 0; i < userArray.length; i++) {
			userArray[i].showInfo();
		}
		
		// Down Casting 을 해서 Employee 클래스의 salary 값을 가져와야 해.
		// 현재 u3 = User -> Employee 바꿔야함.
		
		int salary = ((Employee)u3).getSalary();
		System.out.printf("운영자의 월급은 %,d원 입니다. ", salary);
	}

}
