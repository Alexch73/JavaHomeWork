package home1;

public class HomeFour {
    public static void main(String[] args) {
        double NoOne = 8.5;
        double NoTwo = 11.45;
        int Osnov = 10;
        double ModOne = Math.abs(Osnov-NoOne);
        double ModTwo = Math.abs(Osnov-NoTwo);
        if (ModOne>ModTwo)System.out.println("число "+ NoTwo +" ближе к  "+ Osnov);
        if (ModOne<ModTwo)System.out.println("число "+ NoOne +" ближе к  "+ Osnov);
        else if (ModOne==ModTwo)System.out.println("Чиcла равноудалены от числа " + Osnov);
    }
}
