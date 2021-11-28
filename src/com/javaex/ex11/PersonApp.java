package com.javaex.ex11;

public class PersonApp {

	public static void main(String[] args) {
	
		Person p01 = new Person("송승하", 29);
		
		Person p02 = new Person();
		p02.setName("권봉욱");
		p02.setAge(29);
		
		Person p03 = new Person("이선흠", 29);
		
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		System.out.println(p03.toString());
		
		
		p01.showinfo();
		p02.showinfo();
		p03.showinfo();
		
		//Student Person 상속 받고 테스트
		Student s01 = new Student();
		s01.setName("강호동");
		s01.setAge(55);
		s01.setSchoolName("야현고등학교");
		
		System.out.println(s01.getName());
		System.out.println(s01.getAge());
		System.out.println(s01.getSchoolName());

}
}
