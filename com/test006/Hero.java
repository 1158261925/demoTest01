package com.test006;

public class Hero {
	public String name;
	protected float hp;
	public String toString(){
		return this.name;
	}
	public void finalize(){
		System.out.println("这个英雄正在被回收！");
	}
	public static void main(String[] args) {
		Hero hero;
		for(int i=0;i<10000;i++){
			hero=new Hero();
		}
	}
}
