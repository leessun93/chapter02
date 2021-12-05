package com.javaex.exam;

public class PersonApp {

	public static void main(String[] args) {
		//메모리에 올리는건 생성자가한다
		Person p01 = new Person();
		Person p02 = new Person("이효리", 99);
		
		p01.setName("이정재");
		p01.setAge(29);
	
		
		
		System.out.println(p01.getAge());
		System.out.println(p01.getName());
		
		p01.showInfo();
		p02.showInfo();
		
		
		Student s01 = new Student("강미나", 22, "선흠고등학교");
		
		Student s02 = new Student();
		
		s02.setName("카리나");
		s02.setAge(20);
		s02.setSchoolName("선흠고등학교");
		
		System.out.println(s02.toString());
		System.out.println(s01.toString());
		
		
	}

}
