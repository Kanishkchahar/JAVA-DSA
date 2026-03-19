public class StripIndentation {
    public static void main(String[] args) {
        String str = "        My    name           is                  kanishk            ";
        String s1 = str.stripIndent();
        System.out.println(s1);
    }
}
