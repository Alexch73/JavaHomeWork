package homeThreeText;

public class HomeTwo {

    public static void main(String[] args) {
        int sc = 0;
        for (int i = 1; i <= 99; i++) { //делаем счетчик нечетных числел который будет являться размером создаваемого массива
            if (i % 2 != 0) {
                sc = sc + 1;

            }
        }
        int[] massN = new int[sc];
        for (int c = 0, g = 1; c < massN.length; c++) { //поскольку нумерация ячеек массива начинается с 0 последняя ячейка будет иметь индекс 49
            massN[c] = g;
            g = g + 2;
            System.out.print(massN[c] + " ");
        }
        System.out.println("");
            for (int gn = sc - 1; gn >= 0; gn--) {// отнимаем 1 поскольку поледняя ячейка имеет значение 49
                System.out.print(massN[gn] + " ");
            }



    }
}
