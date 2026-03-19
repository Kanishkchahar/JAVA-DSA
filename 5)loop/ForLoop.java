import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print(i+1 +" ");
        }
        System.out.println();
        int sum = 0;
        for(int j=0; j<n; j++){
            sum = sum + j + 1;
        }
        System.out.print("Sum is : "+sum);
    }
}
