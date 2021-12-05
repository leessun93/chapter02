package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p01 = new Person("정우성", 45);
		p01.showinfo();
		
		Student s01 = new Student("이정재", 46 , "부림고등학교");
		s01.showinfo();
		s01.getName();
		
		Person ps01 = new Student("강호동", 50, "마상고등학교");
		ps01.getName();
		ps01.showinfo();
		ps01.toString();
	}

}
