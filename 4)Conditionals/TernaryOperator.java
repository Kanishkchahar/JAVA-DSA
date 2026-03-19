import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
//        if(n%2==0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }

        String result = n%2==0 ? "Even" : "Odd";

        System.out.print(result);


    }
}
