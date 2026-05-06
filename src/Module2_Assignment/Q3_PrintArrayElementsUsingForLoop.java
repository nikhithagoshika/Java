package Module2_Assignment;

public class Q3_PrintArrayElementsUsingForLoop {
    public static void main(String[] args){
        int[] marks={85,92,67,78,55,90};
        for(int i=0;i<=marks.length-1;i++){
            System.out.println("Index "+i+": "+marks[i]);
        }
        System.out.println("Total Elements: "+marks.length);

    }
}
