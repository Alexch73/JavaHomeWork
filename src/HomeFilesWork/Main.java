package HomeFilesWork;

import java.io.*;
import java.nio.charset.Charset;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in =new Scanner(System.in);
        System.out.println("Введите имя файла который необходимо скопировать");

           String  FileName = in.nextLine();
        System.out.println("Введите имя файла в который скопировать предыдущий файл");
        String  FileName1 = in.nextLine();
        writeToFile(FileName,true, Charset.forName("UTF-8"));
        copyToFile(FileName,FileName1);
        simvolCount(FileName);

        System.out.println("Введите имя файла который необходимо разбить");
        String  FileNameD = in.nextLine();
        System.out.println("введите имя файла для  1 части разбитого файла");
        String  FileNameA = in.nextLine();
        System.out.println("введите имя файла для  2 части разбитого файла");
        String  FileNameB = in.nextLine();
        System.out.println("введите значение, с какого байта будет происходить разделение файла");
        long a=in.nextLong();
        destrotToFile(FileNameD ,FileNameA, FileNameB,a);
    }
    public static void writeToFile(String fileName,
                                   boolean append, Charset charset)
            throws IOException {
        try (FileOutputStream outputStream =
                     new FileOutputStream(fileName, append))
        {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++){
                sb.append("какойто текст ").append(i).append("\n");
            }

            byte[] bytes = sb.toString().getBytes(charset);
            outputStream.write(bytes);


        }
    }

    public static void copyToFile(String fileName, String fileName1)
            throws IOException {
        try (FileInputStream origin=new FileInputStream(fileName);
             FileOutputStream copy=new FileOutputStream(fileName1))
        {

            byte[] buffer = new byte[origin.available()];
            // читаем из буффера
            origin.read(buffer, 0, buffer.length);
            //пишу в буфер
            copy.write(buffer, 0, buffer.length);
        }
        try(FileInputStream fin=new FileInputStream(fileName))
        {
            System.out.printf("Количество скопированных байт: %d bytes \n", fin.available());
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    public static void destrotToFile(String fileName,String fileName1,String fileName2,long z)
            throws IOException {
        File file = new File(fileName);
        FileInputStream in = new FileInputStream(file);
        long part1Length = z;
        FileOutputStream out = new FileOutputStream(fileName1);
        FileOutputStream out2 = new FileOutputStream(fileName2);
        long read = 0;
        int b;
        while ((b = in.read()) >= 0){
            if(++read <= part1Length)
                out.write(b);
            else
                out2.write(b);
        }
        out.close();
        out2.close();
    }
    public static void simvolCount(String fileName) throws FileNotFoundException {
        String path = fileName;
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String str;
        int  a = 0;
        while (scanner.hasNextLine()) {
            str = scanner.nextLine();

            if (str.contains(",")) {
                a++;
            }

        }

        System.out.println("Символ запятая используется " + a + " раз");
    }
            }


