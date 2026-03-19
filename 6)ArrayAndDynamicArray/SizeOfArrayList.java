import java.util.ArrayList;

public class SizeOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++){
            list.add(i*3);
        }
        System.out.println(list.size());
        System.out.println(list.reversed());

    }
}
