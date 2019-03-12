package Home2;

public class HomeSeven {
    public static void main(String[] args) {
        int b=0;
        for(int h=0;h<=23;h++){ //цикл проверки по часам
            for(int m=0;m<=59;m++){
                if(h/10%10==m%10&h%10==m/10%10){ //цикл проверки по минутам
                    b++;
                }
            }
        }
        System.out.println("Всего "+b+" совпадений");
    }
}
