package Gospital;

import java.util.ArrayList;
import java.util.Scanner;

public class Opred {
    int a;
    String name, doctor,vis,vr;

    ArrayList<String> Listik = new ArrayList<>();
    ArrayList<String> ListikH = new ArrayList<>();
    ArrayList<String> ListikL = new ArrayList<>();
    ArrayList<String> ListikS = new ArrayList<>();

    void Napolnenie() {
        Listik.add(0, "Главный врач");
        Listik.add(1, "Хирург");
        Listik.add(2, "Лор");
        Listik.add(3, "Стоматолог");
        Listik.add(4, "Пациент");
        ListikH.add(0, "Пациент к Хирургу");
        ListikS.add(0, "Пациент к стоматолгу");
        ListikL.add(0, "Пациент к лору");
    }
        void author () {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите логин");
           vis=in.nextLine();
            for (int i = 0; i < Listik.size(); i++) {
                if (vis.equals(Listik.get(i))){
                //System.out.println("Вы вошли как " + Listik.get(i) );
                 a=i;
                }
            }
            if (a!=0) {
            System.out.println("Вы вошли как " + Listik.get(a) ); }
            else {
                System.out.println("Пользователь не был зарегестрирован, пройдите регистрацию введите ваше имя");
                String vis = in.next();
                a = Listik.size();
                Listik.add(a, vis);
                System.out.println("Введите необходимого врача");
                switch (in.next()) {
                    case "Хирург":
                        a = ListikH.size();
                        ListikH.add(a, vis);

                        System.out.println("Вы записались на прием к врачу " + Listik.get(1));


                        break;
                    case "Лор":
                        a = ListikL.size();

                        ListikL.add(a, vis);
                        System.out.println("Вы записались на прием к врачу " + Listik.get(2));

                        break;
                    case "Стоматолог":
                        a = ListikS.size();
                        ListikS.add(a, vis);

                        System.out.println("Вы записались на прием к врачу " + Listik.get(3));

                        break;
                    default:
                        System.out.println("некорректно введено имя врача, пожалуйста повторите регистрацию заного");
                }
            }


            }



    }


