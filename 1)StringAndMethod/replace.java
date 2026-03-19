public class replace {
    public static void main(String[] args) {
        String name = "tanishk";
        String myname = name.replace('t','k');
        System.out.println(myname);


        String text = "one two three two one";
        String s = text.replaceFirst("two","five");
        System.out.println("Use of replaceFirst : "+s);


        String p = text.replaceAll("two","five");
        System.out.println("Use of replaceAll : "+p);

    }
}
