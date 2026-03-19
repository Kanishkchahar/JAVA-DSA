public class MinElement {
    public static void main(String[] args) {
        int[] arr = {1,2,-23,-234,234};
        int minVal = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<minVal){
                minVal = arr[i];
            }
        }
        System.out.println(minVal);
    }
}
