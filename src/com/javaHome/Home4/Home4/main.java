package com.javaHome.Home4.Home4;


public class main {
    public static void main(String[] args) {
Cat cat1 = new Cat("Кот1",5,15,8);
Cat cat2=new Cat("Кот2",3,7,10);

if (cat1.fight(cat2)==true){
    System.out.println("Победил кот "+ cat1.name) ;
}
else
    System.out.println("Победил кот "+ cat2.name);

    }
}
