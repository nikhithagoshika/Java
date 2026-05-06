package Module2_Assignment;

public class Q2_SumOfNumbersUsingWhileLoop {
    public static void main(String[] args){
        int i=1;
        int sum=0;
        while(i<=20){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of 1 to 20 =" +sum);
    }

}
