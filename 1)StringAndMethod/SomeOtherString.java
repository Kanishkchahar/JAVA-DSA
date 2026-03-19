public class SomeOtherString {
    public static void main(String[] args) {

        //int/double/byte/float/so so to string
        int a = 10;
        String s = String.valueOf(a);
        System.out.println(s+12);

        //Odject to string
        Integer f = new Integer(1234);
        String str = f.toString();
        System.out.println(str);
    }
}
