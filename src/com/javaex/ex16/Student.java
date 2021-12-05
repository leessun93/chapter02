package com.javaex.ex16;

public class Student extends Person {
	
	//필드
	
	private String schoolName;
	//생생자
	public Student() {
		super();
	}
	
	public Student(String name, int age,String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}
	// 메소드 겟 셋
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}

	public void showinfo() {
		System.out.println("*********************************************************************");
		System.out.println("이름 : " + name + " 나이 : " + age + " 학교명 : " + schoolName);
		System.out.println("*********************************************************************");
	}
	
	
}
