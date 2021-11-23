package com.javaex.ex02;

public class Point {
	
	private int x;
	private int y;
	
	
	
//	//생성자
		public Point() {
		System.out.println("Point ()");
		}
		
		
		public Point(int x) {
			this.x = x;
			System.out.println("Point (1)");
		}
		
		
// 생성자 다시
	public Point(int x, int y) {
		//해당 클래스를 메모리에 올리는 일
		this.x =x;
		this.y =y;
		System.out.println("Point (2)");
	}
	
	//메소드
	
	public void setX(int x) { //인트 a받을건데 a= x로 넣을거다
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}

	public void draw() {
		System.out.println("점 [X="+x+",+"+"y="+ y +"]을 그렸습니다.");
	}
}