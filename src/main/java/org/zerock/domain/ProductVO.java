package org.zerock.domain;

/**
 * SpringBoard 
 * 클래스명 : ProductVO.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 21.
 * 클래스 소개 : 데이터를 뷰로 보내기 위한 Model 객체 사용
 */
public class ProductVO {
	
	private String name;
	private double price;
	
	public ProductVO(String name, double price){
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName(){
		return name;
	}
	
	public double getPrice(){
		return price;
	}
	
	@Override
	public String toString(){
		return "ProductVO [name=" + name + ", price=" + price + "]";
	}
}
