package Module2_Assignment;

public class Q10_RowSum_ColumnMax {
    public static void main(String[] args){
        int[][] data = {
                {12, 45, 33},
                {28, 16, 54},
                {71, 39, 22}
        };
        int sum=0;
        int max=0;
        for(int i=0;i<data.length;i++){
            for(int j=1;j<data[i].length;j++){
                sum=sum+data[i][j];
            }
            System.out.println("Row " + i + " sum = " + sum);
        }
        for (int j=0;j< data[0].length;j++) {
            max = data[0][j];
            for (int i=0;i< data.length;i++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }
            System.out.println("Column " + j + " max = " + max);
        }
    }
}
