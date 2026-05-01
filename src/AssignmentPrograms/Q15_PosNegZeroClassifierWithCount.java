package AssignmentPrograms;

public class Q15_PosNegZeroClassifierWithCount {
    public static void main(String[] args){
        int [] a={-5,12,0,-3,8,0,15,-9,4,0};
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for(int i = 0;i<a.length;i++){
            if(a[i]>0){
                positiveCount++;
            } else if (a[i]<0) {
                negativeCount++;
            }
            else{
                zeroCount++;
            }
        }
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);
    }
}
