package com.greedy.level02.normal;

import java.util.Scanner;

public class StudentVO {
	
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	
	public StudentVO() {}
	
	public StudentVO(int grade, int classroom, String name, double height, char gender){
		
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;	
		
		
		
	}
	
		
	public void printIntformation() {
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + classroom);
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("성별 : " + gender);
		
	}
		
	
}
