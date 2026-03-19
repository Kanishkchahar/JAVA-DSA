import java.util.Arrays;

public class ArraysbinarySearch {
    public static void main(String[] args) {
        int[] arr = {0,2,4,6,8,10,12,14,16};
        System.out.println(Arrays.binarySearch(arr,14));

        System.out.println(Arrays.binarySearch(arr,7));

        System.out.println(Arrays.binarySearch(arr,18));

        System.out.println(Arrays.binarySearch(arr,1,7,8));

        System.out.println(Arrays.binarySearch(arr,1,7,14));

    }
}
