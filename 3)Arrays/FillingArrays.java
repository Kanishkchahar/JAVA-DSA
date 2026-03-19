import java.util.Arrays;

public class FillingArrays {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0};
        Arrays.fill(arr,12);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,2,5,8);
        System.out.println(Arrays.toString(arr));
    }
}
