package homeLessonOne;

public class HomeFive {
    public static void main(String[] args) {
float Ca=1, Cb=8, Cc=12, KorOne=0, KorTwo=0;
double Cd=(Cb*Cb)-(4*Ca*Cc); //Формула дискриминанта: D=b2-4ac от ax2+bx+c=0
        if(Cd==0){
            KorOne=-1*(Cb/(2*Ca));
            System.out.println("Квадратный корень 1 и равен = "+KorOne);
        }
        else { if(Cd>0){
                KorOne=((-1*Cb)+(float)Math.sqrt(Cd))/(2*Ca);
                KorTwo=((-1*Cb)-(float)Math.sqrt(Cd))/(2*Ca);
                System.out.println("Квадратных корня 2 "+KorOne+" и " +KorTwo);
            }
            else { System.out.println("в уровнении нет корней");
            }
        }
    }
}
