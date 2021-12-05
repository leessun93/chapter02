package com.javaex.ex11;

public class Student extends Person { // 연결해주는 코드 상속받는다 꼭 주의할것
	//필드
	private String schoolName;

	//생성
	public Student() {
	}
	
	public Student(String schoolName) {
		 this.schoolName = schoolName;
	}
	
	public Student(String name, int age, String schoolname) {
		super.setName(name);
		super.setAge(age);
		
		
		//private로 막혀서 안보임
		//super.name = name;
		//super.age = age;
		this.schoolName = schoolname;
				
	}
//겟셋
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
//메소드 일반
	












	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}

}
