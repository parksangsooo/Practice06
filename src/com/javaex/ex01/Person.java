package com.javaex.ex01;

public class Person {
	private String name;
	private String hp;
	
	public Person(String name, String hp) {
		super();
		this.name = name;
		this.hp = hp;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHp() {
		return this.hp;
	}
	
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public void showInfo() {
		System.out.printf("#이름: %s, #핸드폰: %s\n", name, hp);
	}
		
}
