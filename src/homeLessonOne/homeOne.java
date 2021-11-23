package homeLessonOne;

import java.util.Scanner;
public class homeOne {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите высоту прямоугольно параллелипипеда");
        int vis = in.nextInt();
        System.out.print("Введите длину прямоугольно параллелипипеда");
        int dlin = in.nextInt();
        System.out.print("Введите ширину прямоугольно параллелипипеда");
        int shir = in.nextInt();
        System.out.println("площадь параллелипипеда равна " + 2*((vis*dlin)+(dlin*shir)+(vis*shir)));
        if (vis > shir) System.out.println( "Высота является наибольшей по сравнению с шириной и равна = " + vis );
        if (vis < shir) System.out.println(" Ширина является наибольшей по сравнению с высотой и равна = "+ shir);
        if (vis==shir) System.out.println(" Ширина и высота одинаковы и равны = "+ shir);
        in.close();
    }
}
