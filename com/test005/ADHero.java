package com.test005;
//super�ؼ���ʵս
public class ADHero extends Hero implements AD {
	int moveSpeed=333;      //�ƶ��ٶ�
	@Override
	public void physicAttack() {
		// TODO Auto-generated method stub
		System.out.println("������������");
	}
	public ADHero(){
		super();
		System.out.println("ADHero�޲ι��췽����");
	}
	public ADHero(String name){
		super(name);
		System.out.println("ADHero�вι��췽����");
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
