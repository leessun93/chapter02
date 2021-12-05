package com.javaex.ex15;

public class Rectangle extends Shape {

	//private String lineColor;
	//private String fillColor;
	private int width;
	private int height;
	
	
	public Rectangle() {
		super();  //shape 기본생성자
	}
	
	public Rectangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}


	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", lineColor=" + lineColor + ", fillColor="
				+ fillColor + "]";
	}

	public void draw() {
		System.out.println("선색" + super.lineColor + "면색:"+ super.fillColor+ "가로 :" + this.width +"세로:" + this.height + "사각형을 그렸읍니다.");
	}

	
	
	
}
