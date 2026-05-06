package Module2_Assignment;

public class Q6_FizzBuzzWithCounter {
    public static void main(String[] args){
        int n;
        int count = 0;
        for(int i=1;i<=50;i++){
            if(i%3==0 & i%5==0){
                System.out.println("FizzBuzz");
                count++;
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
        System.out.println("FizzBuzz Count :"+count);
    }
}
