public class index {

    public static void main(String[] args) {
        String theString = "is this good or is this bad?";
        String substring = "is";

        int index = theString.indexOf(substring);
        while (index != -1) {
            System.out.println(index);
            index = theString.indexOf(substring, index + 1);


        }
        int lastindex = theString.lastIndexOf(substring);
        System.out.print("Last index of is is " +lastindex);
    }
}