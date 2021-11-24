package com.javaHome.Home4.Home2;

public class Triangle {
    public int StA=5,StB=6,StC=4,P;
    public double S;
    void PTriangle(){
        P=StA+StB+StC;
        System.out.println("Периметр треугольника равен "+P);
    }
    void STriangle () {
        S=0.5*(StA*StB);
        System.out.println("Площадь прямоугольного треугольника равна "+(int)S);
    }
}
