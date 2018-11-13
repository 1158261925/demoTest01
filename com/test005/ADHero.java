package com.test005;
//super关键字实战
public class ADHero extends Hero implements AD {
	int moveSpeed=333;      //移动速度
	@Override
	public void physicAttack() {
		// TODO Auto-generated method stub
		System.out.println("进行物理攻击！");
	}
	public ADHero(){
		super();
		System.out.println("ADHero无参构造方法！");
	}
	public ADHero(String name){
		super(name);
		System.out.println("ADHero有参构造方法！");
	}
	public int getSpeed(){
		return this.moveSpeed;
	}
	public int getSpeed2(){
		return super.moveSpeed;
	}
	public static void main(String[] args) {
		ADHero ad=new ADHero();
		System.out.println(ad.getSpeed());
		System.out.println(ad.getSpeed2());
	}

}
