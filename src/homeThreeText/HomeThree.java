package homeThreeText;

public class HomeThree {
    public static void main(String[] args) {

        int b=0;
        int[] rMass = new int[15];
        for (int i = 0, a;  i < 15; i++)
        {
            a = (int) (Math.random() * (9 + 1));
            rMass[i] = a;
            if ( (a%2==0)&& (a!=0) )
            b++;
            System.out.print(rMass[i]+" ");

        }
        System.out.println("");
        System.out.println(" Количество четных элементов заданном массиве = " +b);


        }
    }