package com.javaex.ex07;

public class TvApp {
	//필드
	
	//생성자
	
	//메소드 g/s
	
	//메소드 일반
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new Tv(7,20, false);
		
		tv.status();
		
		tv.getPower(true);
		tv.getVolume(120);
		tv.status();
		
		tv.getVolume(false);
		tv.status();
		
		tv.getChannel(0);
		tv.status();
		
		
	}

}
