package AssignmentPrograms;

public class Q11_LargestOfThreeNumbers {
    public static void main(String[] args){
        int a=54,b=89,c=73;
        if (a > b) {
            if (a > c) {
                System.out.println("Largest is a: " + a);
            } else {
                System.out.println("Largest is c: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Largest is b: " + b);
            } else {
                System.out.println("Largest is c: " + c);
            }
        }

    }

}
