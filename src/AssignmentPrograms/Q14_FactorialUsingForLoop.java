package AssignmentPrograms;

public class Q14_FactorialUsingForLoop {
    public static void main(String[] args) {
        int n = 10;
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        System.out.println("Factorial is: " + result);
    }
}
