package com.javaex.ex11;

public class Person {
	//필드
	private String name;
	private int age;
	//생성자
	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public Person() {

	}

	
	
	
	//메소드 겟 셋
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		if(age<1) {
			return 1;
		}else {
			return age;	
		}
	}

	public void setAge(int age) {
		this.age = age;
	}

	//메모리 일반 
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public void showinfo() {
		// name this.name getName() this.getName()
		System.out.println("===================================");
		System.out.println("이름:" + this.getName());
		System.out.println("나이:" + this.getAge());
		System.out.println("===================================");
		System.out.println("");
	}
		
	
}
