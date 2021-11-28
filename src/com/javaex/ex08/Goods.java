package com.javaex.ex04;

public class Goods {

	// 필드
	private String name;
	private int price;
	private int totalcount;
	// 생성자
	public Goods() {
		System.out.println("Goods()");
	}
//	
//
//	public Goods(String name) {
//		super();
//		this.name = name;
//	}


	public Goods(String name, int price) {

		this.name = name;
		this.price = price;
		System.out.println("public Goods(String name, int price)");
	}
	// 메소드 g/s

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	public int getTotalcount() {
		return totalcount;
	}


	public void setTotalcount(int totalcount) {
		this.totalcount = totalcount;
	}


	// 메소드 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

	
	
	
}