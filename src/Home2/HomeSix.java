package Home2;

public class HomeSix {
    public static void main(String[] args){
        int sB=0;
        for(int i=1001;i<1000000;i++){
            int p1=i/100000%10, p2=i/10000%10, p3=i/1000%10, p4=i/100%10, p5=i/10%10, p6=i%10; //выбираем конкретные чсила из общего числа
            if((p1+p2+p3)==(p4+p5+p6)){
                sB++;
            }
        }
        System.out.println(sB);
    }
}
