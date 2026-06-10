import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] arg){
        int[] arr = {5,8,2,6,9,5,3,2,6,9};
        slectionsort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void slectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            // find max and swap with correct index
            int last = arr.length -i -1;
            int max = maxElemenIndext(arr,0,last);
            swapTwoIndex(arr,max,last);
        }
    }

    static int maxElemenIndext(int[] arr , int start, int end){
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swapTwoIndex(int[] arr , int first, int second){
        int  temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
