package com.javaHome.Home4.Home4;

public class Cat {
    String name;
    int age, weight, strength,s1,s2;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;



    }
    public boolean fight(Cat anotherCat) {
       s1=(weight*strength)/age;
       s2=(anotherCat.strength*anotherCat.weight)/anotherCat.age;
       if (s1>s2)
           return  true;
        else
            return false;

    }

}
