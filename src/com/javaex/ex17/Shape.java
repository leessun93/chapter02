package com.javaex.ex17;

public class Shape { // 추상 메소드를 갖고이씨어서 클래스와 미완성이 부분이 있음 area()
					//
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
	

	
	//area만들지 못함
	public abstract double area(); // 추상 메소드 //내부 코드를 작성할 수 없는상황 // 자식 코드에서 꼭 내부코드를 구현해야함
}
