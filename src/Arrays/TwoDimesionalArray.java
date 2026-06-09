package Arrays;
import java.util.Arrays;

public class TwoDimesionalArray {
    public static void main(String[] args){
        int[][] matrix=new int[3][3];
        matrix[0][0]=10;
        matrix[0][1]=20;
        matrix[0][2]=30;

        int [][] matrix1={{10,20,30},{40,50,60},{70,80,90}};

        System.out.println(Arrays.deepToString(matrix1));

        String[][] EnvConfig={
                {"Stage","Stage.com","Active"},
                {"QA","qa.com","Active"},
                {"Production","Prod.com","InActive"}

        };
        System.out.println(Arrays.deepToString(EnvConfig));
        System.out.println(EnvConfig.length);

        String TarEnv="Production";
        for(int i=0;i<EnvConfig.length;i++)
        {
            if(EnvConfig[i][0].equals(TarEnv))
            {
                System.out.println("TargetEnvironment found!!");
                System.out.println("Environment is:"+EnvConfig[i][0]);
                System.out.println("URL is:"+EnvConfig[i][1]);
                System.out.println("Status is:"+EnvConfig[i][2]);
                break;
            }
        }
        //For Loop to print all values

        /*for(int i = 0; i < EnvConfig.length; i++) {
            System.out.println(Arrays.toString(EnvConfig[i]));
        }*/
        //for each
        for(String[] row : EnvConfig) {
            System.out.println(Arrays.toString(row));
        }
    }

}
