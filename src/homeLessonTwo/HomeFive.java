package homeLessonTwo;

public class HomeFive {
    public static void main(String[] args){
               int varA=1,varB=1,varC;
        System.out.print("Числа последовательности " +varA+" " +varB+ " ");
        for(int i=3;i<=11;i++)
        {
            varC=varA+varB;
            varA=varB;
            varB=varC;
            System.out.print(varC+" ");
        }
    }
}
