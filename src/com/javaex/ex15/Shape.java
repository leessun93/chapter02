package com.javaex.ex15;

public class Shape {
	//필드
	protected String lineColor;
	protected String fillColor;
	
	//생성자
	public Shape(String lineColor, String fillColor) {
	
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}
	public Shape() {

	}
	
	//메소드 갯셋
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	
	//메소드 일반
	
	
	
	@Override
	public String toString() {
		return "ShapeApp [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	
	public void draw() {
		System.out.println("선색 : " + lineColor + "면색 : " + fillColor + "를 그렸습니다");
	}
	
	

}
