package com.javaex.ex18;

public class Triangle extends Shape {
	private int width;
	private int height;
	
	public Triangle() {
		super();
	}

	public Triangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", lineColor=" + lineColor + ", fillColor="
				+ fillColor + "]";
	}
	
	
	public void draw() {
		System.out.println("선색: "+ lineColor + " 면색: " + fillColor +"높이" + this.height +"넓이"+this.width+ "삼각형을 그렸습니다.");
	}
	
	
	public double area() {
		double result = (width * height)/2;
		return result;
	}
	
	
	
	
	

}
