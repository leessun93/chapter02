package com.javaex.ex02;

public class Point {
	
	private int x;
	private int y;
	
	
	
	//메소드
	
	public void setX(int a) { //인트 a받을건데 a= x로 넣을거다
		x = a;
	}
	public void setY(int b) {
		y = b;
	}

	public void draw() {
		System.out.println("점 [X="+x+",+"+"y="+ y +"]을 그렸습니다.");
	}
}