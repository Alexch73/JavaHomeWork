package homeThreeText;
import java.util.Scanner;
public class HomeStrOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите текст:");
        String stroc = sc.nextLine();
        System.out.println("введите, что необходимо заменить ");
        String podstroc = sc.nextLine();
        System.out.println("на что будем менять ");
        String newstroc = sc.nextLine();
        stroc=stroc.replace(podstroc,newstroc);
        System.out.println(stroc);
    }
}
