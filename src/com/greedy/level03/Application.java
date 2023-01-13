package com.greedy.level03;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc2 = new Scanner(System.in);
		System.out.print("num  : ");
		int num = sc2.nextInt();
		sc2.nextLine();
		System.out.print("name : ");
		String st1 = sc2.nextLine();
		System.out.print("dept : ");
		String st2 = sc2.nextLine();
		System.out.print("job : ");
		String st3 = sc2.nextLine();
		System.out.print("age : ");
		int age = sc2.nextInt();
		System.out.print("gender : ");
		sc2.nextLine();
		char gen = sc2.nextLine().charAt(0);
		System.out.print("salary : ");
		int sal = sc2.nextInt();
		System.out.print("bonuspoint : ");
		double bonus = sc2.nextDouble();
		sc2.nextLine();
		System.out.print("phone : ");
		String phone = sc2.nextLine();
		System.out.print("address : ");
		String add = sc2.nextLine();
		System.out.println();
		
		EmployeeDTO dt = new EmployeeDTO();
		dt.setNumber(num);
		dt.setName(st1);
		dt.setDept(st2);
		dt.setJop(st3);
		dt.setAge(age);
		dt.setGender(gen);
		dt.setSalary(sal);
		dt.setBonusPoint(bonus);
		dt.setPhone(phone);
		dt.setAddress(add);
		
		System.out.println(dt.getNumber());
		System.out.println(dt.getName());
		System.out.println(dt.getDept());
		System.out.println(dt.getJop());
		System.out.println(dt.getAge());
		System.out.println(dt.getGender());
		System.out.println(dt.getSalary());
		System.out.println(dt.getBonusPoint());
		System.out.println(dt.getPhone());
		System.out.println(dt.getAddress());
		
	}

}
