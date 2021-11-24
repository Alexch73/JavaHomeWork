package com.javaHome.Home4.Home2;

public class Rectangle {
    public int ShirB = 5, DlinaA=6,p,s;
    void  Perimetr (){
        p=((ShirB+DlinaA)*2);
        System.out.println("Периметр прямоугольника равен "+p);
    }
    void SPriam(){
        s=DlinaA*ShirB;
        System.out.println("Площадь прямоугольника равна "+s);
    }
}
