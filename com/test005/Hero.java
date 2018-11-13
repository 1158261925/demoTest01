package com.test005;

public class Hero {
    
    String name; //姓名
        
    float hp; //血量
        
    float armor; //护甲
        
    int moveSpeed=500; //移动速度
         
    public Hero(){
        System.out.println("Hero的无参的构造方法 ");
    }
     
    public Hero(String name){
        System.out.println("Hero的有一个参数的构造方法 ");
        this.name = name;
    }
     
    public static void main(String[] args) {
        new Hero("张三");
        new Hero();
    }
      
}