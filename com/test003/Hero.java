//多态及接口的应用实例
package com.test003;

public class Hero {
	public void kill(Mortal m){
		m.die();
	}
	public static void main(String[] args) {
		Mortal adhero=new ADHero();
		Mortal aphero=new APHero();
		Mortal adaphero=new ADAPHero();
		
		Hero galen=new Hero();
		galen.kill(adhero);
		galen.kill(aphero);
		galen.kill(adaphero);
		
		
	}
}
