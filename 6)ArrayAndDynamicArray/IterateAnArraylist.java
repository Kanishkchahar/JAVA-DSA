import java.util.ArrayList;

public class IterateAnArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<5; i++){
            list.add(i*3);
        }

        for(int i=0; i<5; i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
