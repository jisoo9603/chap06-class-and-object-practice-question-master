package com.greedy.level02.normal;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 grade 입력 : ");
		int grade = sc.nextInt();
		System.out.print("학생 classroom 입력 : ");
		int classroom = sc.nextInt();
		System.out.print("학생 name 입력 : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("학생 height 입력 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		System.out.print("학생 gender 입력 : ");
		char gender = sc.nextLine().charAt(0);
		
		StudentVO st = new StudentVO(grade, classroom, name, height, gender);

//		System.out.println("학년 : " + grade);
//		System.out.println("반 : " + classroom);
//		System.out.println("이름 : " + name);
//		System.out.println("키 : " + height);
//		System.out.println("성별 : " + gender);
		st.printIntformation();
	}

}
