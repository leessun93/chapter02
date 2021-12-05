package com.javaex.ex13;

public class ShapeApp {

	public static void main(String[] args) {
		//필드
		//생성자
		//메모리겟셋
		//메모리 일반
		
		//사각형 3개를 만든다(메모리 올린다)
		Ractangle r01 = new Ractangle("빨강", "노랑", 5 , 5);
		Ractangle r02 = new Ractangle("파랑", "노랑", 10,20);
		Ractangle r03 = new Ractangle("빨강", "빨강", 55, 77);
	
		// 사각형 관리를 위해서 배열을 만든다
		Ractangle[] rArray = new Ractangle[3];
		
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		
		//모두 draw 하기
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		//모든 사각형에 선 색만 출력
		for(int i=0; i<rArray.length; i++) {
			System.out.println(rArray[i].getLineColor());
		}
		
//		r01.draw();
//		r02.draw();
//		r03.draw();
		//원을 관리할 배열
		Circle[] cArray = new Circle[3]; 
		//원 세개(c0123)를 만듦
		Circle c01 = new Circle("보라", "빨강", 15);
		Circle c02 = new Circle("검정", "노랑", 5);
		Circle c03 = new Circle("파랑", "초록", 7);
		
		//원(c01)을 배열에 넣기
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
			
		}
		
		Triangle[] tArray = new Triangle[3];
		
		Triangle t01 = new Triangle("빨강", "노랑", 15, 25);
		Triangle t02 = new Triangle("주황", "갈색", 2, 63);
		Triangle t03 = new Triangle("보라", "초록", 34, 35);
		
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
	}

}
