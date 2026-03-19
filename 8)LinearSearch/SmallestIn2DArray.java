import java.util.Arrays;

public class SmallestIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,-2,3,-4,5},
                {5,4,-3,2,2},
                {2,-6,9,-7,5}
        };
        int target = -3;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int [][]arr,int target) {
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
            if(arr[i][j]==target){
                return new int[] {i,j};

            }
        }
    }
    return new int[] {-1,-1};
    }
}
