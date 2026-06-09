package AssignmentPrograms;

public class Q5_OddNumbersRangeWithCount {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 50; i++) {
            if (i%2 == 1) {
                System.out.println(i);
                count = count + 1;
            }

        }
        System.out.println("Total number of Odd Numbers from 1 to 50 is: "+count);
    }
}