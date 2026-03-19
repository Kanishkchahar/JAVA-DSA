public class MaxElement {
    public static void main(String[] args) {
        int maxVal = Integer.MIN_VALUE;
        int[] arr = {1,23,4,6,7,8,99};
        for(int i=0; i< arr.length; i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        System.out.println(maxVal);
    }
}
