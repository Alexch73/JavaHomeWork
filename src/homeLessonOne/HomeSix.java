package homeLessonOne;

public class HomeSix {
    public static void main(String[] args) {
       int ChNol=897, ChOne, ChTwo, ChThree;
       ChOne = (ChNol/100);
       ChTwo = ((ChNol%100)/10);
       ChThree = (ChNol%10);
       System.out.println(ChTwo);
       if ((ChOne>ChTwo)&&(ChOne>ChThree)) System.out.println("Найбиольшая цифра числа равна " + ChOne );
        if ((ChTwo>ChOne) && (ChTwo>ChThree)) System.out.println("Найбиольшая цифра числа равна " + ChTwo );
        if ((ChThree>ChOne) && (ChThree>ChTwo)) System.out.println("Найбиольшая цифра числа равна " + ChThree );
    }
}
