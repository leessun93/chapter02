package com.javaex.ex14;

public class Circle extends Shape {
	private int radius;

	
	
	
	
	public Circle() {
		super();
	}





	public Circle(String lineColor, String fillColor, int radius) {
		super(lineColor, fillColor);
		this.radius = radius;
	}





	public int getRadius() {
		return radius;
	}





	public void setRadius(int radius) {
		this.radius = radius;
	}






	public void draw() {
		System.out.println("선색" + super.lineColor + "면색:"+ super.fillColor+ "곡률" + this.radius+"원을 그렸읍니다.");
	}

	
	
	
	
	
	
	
	
	
	
	
}
