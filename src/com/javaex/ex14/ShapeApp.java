package com.javaex.ex14;

public class ShapeApp {

	public static void main(String[] args) {
		//Shape s01 = new Shape("빨강", "빨강");
		//System.out.println(s01.toString());
		
		Rectangle r01 = new Rectangle("빨강", "빨강", 5, 5);
		//System.out.println(r01.toString());
		
		r01.draw();
		
		Rectangle r02 = new Rectangle("노랑", "노랑", 7, 7);
		Rectangle r03 = new Rectangle("파랑", "파랑", 10, 10);
		
		r01.draw();
		r02.draw();
		r03.draw();
		
		Rectangle[] rArray = new Rectangle[3];
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		///////////////////////////////////////////////////원
		
		Circle c01 = new Circle("검정", "흑색", 5);
		Circle c02 = new Circle("연두", "연두", 7);
		Circle c03 = new Circle("보라", "보라", 29);
		
		c01.draw();
		c02.draw();
		c03.draw();
		
		Circle[] cArray = new Circle[3];
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		for(int i=0;i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		///////////////////////////////////////////////////////삼가켱
		
		Triangle t01 = new Triangle("살색", "살색", 15 , 15);
		Triangle t02 = new Triangle("흑인색", "흑인색", 19, 19);
		Triangle t03 = new Triangle("백인색", "백인색", 6, 9);
		
		t01.draw();
		t02.draw();
		t03.draw();
		
		Triangle[] tArray = new Triangle[3];
		
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		/////////////////////////////////////////////////////////////삼각형
		
		
		
	}

}
