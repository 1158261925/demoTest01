package com.test001;

public class Test1 {
	private Test1(){
		
	}
	/**
	 * ����ʽ�������ģʽ
	 */
//	private static Test1 test=new Test1();
//	public static Test1 getInstance(){
//		return test;
//	}
	
	/**
	 * ����ʽ�������ģʽ
	 */
	private static Test1 testcase;
	public static Test1 getInstance(){
		if(testcase==null){
			testcase=new Test1();
		}
		return testcase;
	}
}
