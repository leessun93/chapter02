package com.javaex.ex17;

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

	public double area() { //Shape 추상클래스(미완성 클래스)를 상속받았음
							//shape 를 상속받으려면 미완성인부분을 구형해주어야함 area()
		double result = width * height;
		return result;
	}
	
	
}
