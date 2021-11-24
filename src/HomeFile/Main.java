package HomeFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        String path = "D:/java/ls/src/HomeFile/wp.txt";
        BufferedReader br = null;
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String str = null;
        int z = 0, a = 0, f = 0;
        int result = 0;
        while (scanner.hasNextLine()) {
            str = scanner.nextLine();

            if (str.contains(" and ")) {
                z++;
            }
            if (str.contains(" War ")) {
                a++;
            }
            if (str.contains(" peace ")) {
                f++;
            }
        }

        System.out.println("Слово War используется " + a + " раз");
        System.out.println("Слово and используется " + z + " раз");
        System.out.println("Слово peace используется " + f + " раз");

        String[] kolichestvoSlov = str.trim().split("\\s+");

//        for (int i = 0; i < kolichestvoSlov.length; i++) {
//            result = result + kolichestvoSlov[i].length();
//        }
//
//        System.out.println(result);
//        System.out.println(str.toString());
//        System.out.println(kolichestvoSlov.length);
    }
    }


