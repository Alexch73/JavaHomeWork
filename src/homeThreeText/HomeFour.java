package homeThreeText;
import java.util.Scanner;
public class HomeFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите чётное положительное число");
        int vis = in.nextInt(),  c = 0, g = 0;
        int[] masChet = new int[vis];
        if ((vis % 2 == 0) && (vis > 0)) {
            System.out.println(" пойдет");

            for (int i = 0, a; i < vis; i++) {
                a = (int) (Math.random() * 11) - 5;
                masChet[i] = a;
                System.out.print(masChet[i] + " ");
            }

            for (int i = 0; i < vis / 2; i++) {
                c = c + Math.abs(masChet[i]);


            }
            System.out.println("");
            System.out.println(c+" сумма модулей первой половины массива");

            for (int i = vis/2; i < vis ; i++) {
                g = g + Math.abs(masChet[i]);

            }
            System.out.println("");
            System.out.println(g+" сумма модулей второй половины массива");
        }
        else System.out.println(" не пойдет, запусти еще раз!)");


        }
    }
