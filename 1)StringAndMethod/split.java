import java.util.*;

public class split {
    public static void main(String[] args) {
        String text = "kanishk is a good boy";
        String[] arr = text.split(" ",3);
        System.out.println(Arrays.toString(arr));

        String name = "kanishk";
        String[] arrr = name.split("");
        System.out.println(Arrays.toString(arrr));

    }
}
