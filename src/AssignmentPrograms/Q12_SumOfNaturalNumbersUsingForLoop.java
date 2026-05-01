package AssignmentPrograms;

public class Q12_SumOfNaturalNumbersUsingForLoop {
    public static void main(String[] args){
        int n=100;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum of first n natural numbers is:" +sum);
        if(sum%2==0){
            System.out.println("Result is Even");
        }
        else{
                System.out.println("Result is Odd");
            }
        }
    }

