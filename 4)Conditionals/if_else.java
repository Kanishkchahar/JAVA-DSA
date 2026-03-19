import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your salary : ");
        int Salary = sc.nextInt();

        if(Salary > 50000){
            Salary -= 7000;
        } else{
            Salary += 10000;
        }


        System.out.println(Salary);
    }
}
