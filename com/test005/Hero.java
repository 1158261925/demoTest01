package com.test005;

public class Hero {
    
    String name; //����
        
    float hp; //Ѫ��
        
    float armor; //����
        
    int moveSpeed=500; //�ƶ��ٶ�
         
    public Hero(){
        System.out.println("Hero���޲εĹ��췽�� ");
    }
     
    public Hero(String name){
        System.out.println("Hero����һ�������Ĺ��췽�� ");
        this.name = name;
    }
     
    public static void main(String[] args) {
        new Hero("����");
        new Hero();
    }
      
}