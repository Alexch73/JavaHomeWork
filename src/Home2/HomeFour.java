package Home2;

public class HomeFour {
    public static void main(String[] args) {
        int a = 13, f = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                f++; }
            }

           if (f > 2)
            System.out.println("Число непростое");
          else
            System.out.println("Число простое");
        }

        }




