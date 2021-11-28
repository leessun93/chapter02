package com.javaex.ex09;

public class MyMath {

	//필드 -- 필요 x
	private static double PI= 3.14159;
	
	//생성자 -- 디폴트생성자 사용
	
	//메소드 g/s -- 필드x
	
	//메소드 일반
	public static int plus(int a, int b) {
		return a+b;
	
	}
	
	public static double plus(double a, double b) {
		return a+b;
	}
	
	public static double plus(double a, int b) {
		return a+b;
	}
	public static double plus(int a, double b) {
		return a+b;
	}
	
	public static double circleArea(int radius) {
		double area = radius*radius*PI;
		return area;
	}
	public static double circleround(int radius) {
		return (radius+radius) *PI;
		}
}
