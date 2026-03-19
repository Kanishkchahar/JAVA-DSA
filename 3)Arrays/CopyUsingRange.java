import java.util.Arrays;

public class CopyUsingRange {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int[] arr2 = Arrays.copyOfRange(arr,1,5);
        System.out.println(Arrays.toString(arr2));
    }
}
