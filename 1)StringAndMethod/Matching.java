public class Matching {
public static void main(String[] args){
    String one = "I am the fucking best";
    System.out.println("i am usin matches : " + one.matches(".*fucking.*"));
    String name1 = "kanishk";
    String name2 = "kanishk";
    String name3 = "KANISHK";
    System.out.println("using equels : " + name1.equals(name2));
    System.out.println("using equalsIgnoreCase : "+name3.equalsIgnoreCase(name2));
    System.out.println("Using startsWith : "+one.startsWith("fucking",9));
    System.out.println("Using endsWith : " + one.endsWith("best"));

    String age1 = "abc";
    String age2 = "zbc";
    String age3 = "has";
    System.out.println(age1.compareTo(age2));
    System.out.println(age1.compareTo(age3));


        }
}
