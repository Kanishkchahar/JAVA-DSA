public class SmallestElement {
    public static void main(String[] args) {
        int[] arr =  {1,2,-3,4,5,-6,7,-8,9};
        System.out.println(SElement(arr));
    }
    static int SElement(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
