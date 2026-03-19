import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
           arr[i]= i;
        }
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(arr2));


//        int[] arr = {1,2,3,4,5,6};
//        int[] arr2 = new int[arr.length];
//        for(int i=0; i<arr.length; i++){
//            arr2[i] = arr[i];
//        }
//        System.out.println(Arrays.toString(arr2));
    }
}
