public class JavaFormatting {
    public static void main(String[] args) {
        String str  = "Hello %s";
        String s1 = str.formatted("World");
        String s2 = str.formatted("Kanishk");
        System.out.println(s1);
        System.out.println(s2);
    }
}
