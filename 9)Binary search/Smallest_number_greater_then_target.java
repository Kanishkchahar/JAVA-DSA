public class Smallest_number_greater_then_target {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,9,10,12};
        int target = 8;
        System.out.println(bianrySearch(arr,target));

    }
    static int bianrySearch(int[] arr,int target){
        int start = 0 ;
        int end = arr.length - 1;
        if(target > arr[arr.length-1]){
            return -1;
        }
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(target<arr[mid]){
                end = mid -1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return arr[start];
    }
}
