package com.test004;
//java�еķ������أ��������ظ����еľ�̬����

public class ADHero extends Hero implements AD {

	@Override
	public void physicAttack() {
		// TODO Auto-generated method stub
		System.out.println("������������");
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
