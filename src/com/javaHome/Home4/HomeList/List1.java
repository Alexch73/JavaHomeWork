package com.javaHome.Home4.HomeList;

import java.util.ArrayList;

public class List1 {

    public  int a,n;
    ArrayList <Integer> Listik = new ArrayList<>();
     void Napolnenie (){
         Listik.add(4);
         Listik.add(5);
         Listik.add(6);
         Listik.add(7);
         for (int n:Listik)
         System.out.println(n);
     }

     void add (int num){
         a=Listik.size();
         Listik.add(a,num);
         System.out.println(Listik.get(a));
     }
     void remove(){
         a=Listik.size()-1;
         System.out.println("Удилили элемент "+Listik.get(a));
         Listik.remove(a);
         for (int n:Listik)
             System.out.println(n);
     }
     void addcont (int num){
         a=Listik.size();
         Listik.add(3,num);
     }
    void removeindex (int index){
        System.out.println("Удилили элемент "+Listik.get(index));
         Listik.remove(index);

        for (int n:Listik)
            System.out.println(n);
    }
}
