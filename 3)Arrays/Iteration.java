import java.util.*;
public class Iteration {
    public static void main(String[] args) {
        String[] stringArray = new String[10];

        for(int i=0; i < stringArray.length; i++) {
            stringArray[i] = " " + i;
        }

        for (String s : stringArray) {
            System.out.println(s);
        }
    }
}
