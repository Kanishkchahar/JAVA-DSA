public class sorted_in_ascending_order {
    public static void main(String[] args) {
    int[] arr = {1,3,56,87,98, 123, 324};
    int target = 123;
    int ans = bianrySearch(arr,target);
        System.out.println(ans);
    }
    static int bianrySearch(int[] arr,int target){
    int start = 0 ;
    int end = arr.length - 1;
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
    return -1;
    }
}
