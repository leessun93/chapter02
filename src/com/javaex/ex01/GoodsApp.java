package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Goods camera = new Goods();
		Goods computer = new Goods();
		Goods cup = new Goods();
		
		
		camera.setName("니콘");
		camera.setPrice(400000);
		/*
		System.out.println(camera.getName());
		System.out.println(camera.getPrice());
		*/		
		computer.setName("LG그렘");
		computer.setPrice(900000);
		
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		camera.showinfo();
		
		computer.showinfo();
		
		
		cup.showinfo();
		
		
		
		
		
//		System.out.println("상품이름"+ camera.getName());
		
		
		/*
		camera.name = "니콘";
		camera.price = 400000;
		
		Goods computer = new Goods();
		computer.name = "LG그램";
		computer.price = 900000;
		
		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.price = 2000;
		
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		*/
	}

}
