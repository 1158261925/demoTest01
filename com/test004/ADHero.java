package com.test004;
//java中的方法隐藏：子类隐藏父类中的静态方法

public class ADHero extends Hero implements AD {

	@Override
	public void physicAttack() {
		// TODO Auto-generated method stub
		System.out.println("进行物理攻击！");
	}
	public static void battleWin(){
		System.out.println("ADHero battle win!");
	}
	public static void main(String[] args) {
		Hero.battleWin();
		ADHero.battleWin();
		Hero hero=new ADHero();
		hero.battleWin();
	}
	
	
}
