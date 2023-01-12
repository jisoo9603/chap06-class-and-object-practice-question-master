package com.greedy.level02.normal;

public class Application {

	public static void main(String[] args) {

		BookDTO man1 = new BookDTO();
		
		man1.getTitle();
		man1.getPublisher();
		man1.getAuthor();
		man1.getPrice();
		man1.getDiscountRate();
		
		System.out.println(man1.getInformation());
		
		man1.setTitle("자바의 정석");
		man1.setPublisher("도우출판");
		man1.setAuthor("낭궁성");
		
		System.out.println(man1.getInformation());		
		
		man1.setTitle("홍길동전");
		man1.setPublisher("활빈당");
		man1.setAuthor("허균");
		man1.setPrice(5000000);
		man1.setDiscountRate(0.5);
		
		System.out.println(man1.getInformation());
		
}
}