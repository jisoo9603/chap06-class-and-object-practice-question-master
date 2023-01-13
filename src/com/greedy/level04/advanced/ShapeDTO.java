package com.greedy.level04.advanced;

public class ShapeDTO {
	
	private int type;
	private double height;
	private double width;
	private String color;
	
	/* 매개변수를 전달 할 필드*/
	public ShapeDTO(int type, double height, double width) {
		this.color = "white";
		this.type = type;
		this.height = height;
		this.width = width;
	}
	
	/* 매개변수를 필드에 초기화 */
	public void setType(int type) {
		this.type = type;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setColor(String white) {
		this.color = white;
	}
	
	public int getType() {
		return type;
	}
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
	public String getColor() {
		return color;
	}
		
		
	

}
