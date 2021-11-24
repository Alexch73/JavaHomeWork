package com.javaHome.Home4.Home3;

public class dog {
    public String name,color,adress;
    public int ves,age;
    public dog(String name) {
       if ((boolean)name.equals("")) {
           this.name = "Собака";
       }
       else this.name=name;
        this.color="Black";
        this.ves = 10;
        this.age = 4;
        this.adress="Уличная";
    }

    public dog(String name, int ves,int age) {
        if ((boolean)name.equals("")) {
            this.name = "Собака";
        }
        else this.name=name;
        if (ves==0) {
            this.ves = 10;
        }
        else this.ves=ves;
        if (age==0) {
            this.age = 4;
        }
        else  this.age=age;
        this.color="Black";
        this.adress="Уличная";
    }

    public dog(String name,int age) {
        if ((boolean)name.equals("")) {
            this.name = "Собака";
        }
        else this.name=name;
        if (age==0) {
            this.age = 4;
        }
        else  this.age=age;
        this.color="Black";
        this.ves = 10;
        this.adress="Уличная";
    }

    public dog(int ves, String color) {
        if (ves==0) {
            this.ves = 10;
        }
        else this.ves=ves;
        if ((boolean)color.equals("")) {
            this.color = "Black";
        }
        else this.color=color;
        this.adress="Уличная";
        this.age = 4;
        this.name= "Собака";
    }

    public dog(int ves,String color,String adress) {
        if (ves==0) {
            this.ves = 10;
        }
        else this.ves=ves;
        if ((boolean)color.equals("")) {
            this.color = "Black";
        }
        else this.color=color;
        if ((boolean)adress.equals("")) {
            this.adress = "уличная";
        }
        else this.adress=adress;
        this.name= "Собака";
        this.age = 4;
    }
}
