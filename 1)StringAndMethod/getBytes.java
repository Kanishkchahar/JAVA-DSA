import java.nio.charset.Charset;
import java.util.Arrays;

public class getBytes {
    public static void main(String[] args) {
//        String str = "AaBbCc";
//        byte[] bytes1 = str.getBytes();
//        System.out.println(Arrays.toString(bytes1));

//        String text = "Kanishk";
//        byte[] bytes = text.getBytes();
//        System.out.println("Byte array: " + Arrays.toString(bytes));
//        for (byte b : bytes) {
//            System.out.println(b + " = " + (char)b);
//    }

        String str = "abcdefghijk";
        byte[] bytes = str.getBytes(Charset.forName("UTF-16"));
        System.out.println(Arrays.toString(bytes));
        }
    }

