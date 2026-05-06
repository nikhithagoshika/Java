package Module2_Assignment;

public class Q5_SkipNumberUsingContinue {
    public static void main(String[] args){
        int n;
        for(int i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
