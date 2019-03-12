package Home2;

public class HomeOne {

    public static void main(String[] args) {

        int a = 7, b = 0, c = -5;
        if ((a < b) && (a < c))
            if (b < c) System.out.println("Последовательность имеет следующий порядок " + a + " " + b + " " + c);
            else  if (b > c)
                    System.out.println("Последовательность имеет следующий порядок " + a + " " + c + " " + b);



        if ((b < a) && (b < c))
            if (a < c) System.out.println("Последовательность имеет следующий порядок " + b + " " + a + " " + c);
            else  if (a > c)
                    System.out.println("Последовательность имеет следующий порядок " + b + " " + c + " " + a);

        if ((c < a) && (c < b))
            if (a < b) System.out.println("Последовательность имеет следующий порядок " + c + " " + a + " " + b);
            else  if (a > b)
                System.out.println("Последовательность имеет следующий порядок " + c + " " + b + " " + a);


            }
    }
