package Module2_Assignment;

public class Q8_ReverseAnArray {
    public static void main(String[] args) {
        int[] arr ={10, 25, 38, 47, 56, 62, 71};
        for (int i=0;i<=arr.length-1;i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i=0; i <=arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.print("\n");
        for (int i = 0; i <=arr.length - 1; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}


