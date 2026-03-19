public class StringConc {
    public static void main(String[] args){
        String[] strings = new String[]{"one","two","three"};
        StringBuilder temp = new StringBuilder();
        for(String i :strings){
            temp.append(i);
        }
        System.out.println(temp.toString());
    }
}
