package AssignmentPrograms;

public class Q8_BitWise {
    public static void main(String[] args){
        int n = 29;

        if((n & 1) == 1) {
            System.out.println(n + " is Odd");
        } else {
            System.out.println(n + " is Even");
        }
    }
}
