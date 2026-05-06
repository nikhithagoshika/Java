package Module2_Assignment;

public class Q9_FindDuplicatesInArray {
    public static void main(String[] args){
        int[] nums = {4, 2, 7, 2, 9, 4, 1, 7, 4};
        boolean[] visited=new boolean[nums.length];
        for(int i=0;i<=nums.length-1;i++){
            if(visited[i]){
                continue;
            }
            int count=1;
            for (int j=i+1; j<nums.length;j++) {
                if (nums[i]==nums[j]) {
                    count++;
                    visited[j]=true; // mark as visited
                }
            }

            if (count>1) {
                System.out.println(nums[i] + " -> " + count + " times");
            }

        }
    }
}
