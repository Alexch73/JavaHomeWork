package com.javaHome.Home4.Home2;

public class Circle {
   public int Radius = 50;
   public double P,S,pi=3.1415;

   void PKruga () {
       P = 2 * pi * Radius;
       System.out.println("Периметр круга равен: " + Radius);
   }
       void SKruga(){
       S=pi*Math.pow(Radius, 2);
           System.out.println("Площадь круга равна: " + S);
    }
}
