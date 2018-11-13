package com.test002;

public class HelloWorld {
	public static void main(String[] args) {
		//枚举类型在switch语句中的应用
		Seanson season=Seanson.SPRING;
		switch (season) {
		case SPRING:
				System.out.println("春天到了！");
			break;
		case SUMMER:
				System.out.println("夏天到了！");
			break;
		case AUTUMN:
				System.out.println("秋天到了！");
			break;
		case WINTER:
				System.out.println("冬天到了！");
			break;
		default:
			break;
		}
	}
}
