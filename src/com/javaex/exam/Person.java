package com.javaex.exam;

public class Person {
	//필드
	private String name;
	private int age;
	
	//썡썡자
	public Person() {
		System.out.println("생생자1번");
	}
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		System.out.println("생생자2번");
	}
	
	//메소드 겟셋
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String showInfo() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	//메소드 일반
	
	

}
