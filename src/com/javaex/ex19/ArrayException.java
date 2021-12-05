package com.javaex.ex19;

public class ArrayException {

	public static void main(String[] args) {
		
		int[] intArray = new int[] {3,6,9};
		
//		intArray[0] = 3;
//		intArray[1] = 6;
//		intArray[2] = 9;
		
		try {
			System.out.println(intArray[3]);
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.toString());
		}finally {
			System.out.println("finally");
		}
	}
}
