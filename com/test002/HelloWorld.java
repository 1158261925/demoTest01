package com.test002;

public class HelloWorld {
	public static void main(String[] args) {
		//ö��������switch����е�Ӧ��
		Seanson season=Seanson.SPRING;
		switch (season) {
		case SPRING:
				System.out.println("���쵽�ˣ�");
			break;
		case SUMMER:
				System.out.println("���쵽�ˣ�");
			break;
		case AUTUMN:
				System.out.println("���쵽�ˣ�");
			break;
		case WINTER:
				System.out.println("���쵽�ˣ�");
			break;
		default:
			break;
		}
	}
}
