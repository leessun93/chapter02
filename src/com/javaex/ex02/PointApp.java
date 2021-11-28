package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point point1 = new Point(3, 6);
	
		
//		point1.setX(5);
//		point1.setY(5);
		point1.draw();
		
		
		
		Point point2 = new Point();
		point2.setX(23);
		point2.setY(13);
		point2.draw();
		
		Point point3 = new Point(100);
		point3.setY(101);
		point3.draw();
		
	
		Point p03 = new Point(55,65);
		p03.draw(true);
		p03.draw(false);
		p03.draw();
		
		
		
	}

}
