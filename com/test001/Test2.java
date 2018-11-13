package com.test001;

public class Test2 {
	public static void main(String[] args) {
		Test1 one=Test1.getInstance();
		Test1 two=Test1.getInstance();
		System.out.println(one==two);
	}
}
