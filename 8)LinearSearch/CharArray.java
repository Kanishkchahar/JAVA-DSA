import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char target = 'i';
        System.out.println(search(name,target));
    }

    static boolean search(String name, char target) {
        if(name.isEmpty()){
            return false;
        }
        for (char ch : name.toCharArray()) {
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
