import java.util.Scanner;

public class leetcode1295 {
    public static void main(String[] args) {
        int[] arr = {12,4335,7,8,89,87,56,635,452};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int a = 0;
        while(num!=0){
            num=num/10;
            a++;
        }
        if(a%2==0){
            return true;
        }
        return false;
    }

}
