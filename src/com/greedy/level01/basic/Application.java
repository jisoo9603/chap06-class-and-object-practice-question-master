package com.greedy.level01.basic;

public class Application {

	public static void main(String[] args) {
		
	
		MemberDTO member1 = new MemberDTO();
	
		member1.getId();
		member1.getPwd();
		member1.getName();
		member1.getAge();
		member1.getGender();
		member1.getPhone();
		member1.getEmail();
		
		System.out.println("id :" + member1.getId());
		System.out.println("pwd : " + member1.getPwd());
		System.out.println("name : " + member1.getName());
		System.out.println("age : " + member1.getAge());
		System.out.println("gender : " + member1.getGender());
		System.out.println("phone : " + member1.getPhone());
		System.out.println("email : " + member1.getEmail());
		
		member1.setId("user01");
		member1.setPwd("pass01");
		member1.setName("홍길동");
		member1.setAge(20);
		member1.setGender('M');
		member1.setPhone("010-1234-5678");
		member1.setEmail("hong123@greedy.com");
		
		System.out.println("변경 후 id : " + member1.getId());
		System.out.println("변경 후 pwd : " + member1.getPwd());
		System.out.println("변경 후 name : " + member1.getName());
		System.out.println("변경 후 age : " + member1.getAge());
		System.out.println("변경 후 gender : " + member1.getGender());
		System.out.println("변경 후 phone : " + member1.getPhone());
		System.out.println("변경 후 email : " + member1.getEmail());
		
		
		
		
	}
	
		
	
	
}
