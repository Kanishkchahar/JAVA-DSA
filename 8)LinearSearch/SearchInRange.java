public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {9,3,8,4,0,5,1,7,6};
        int target = 4;
        System.out.println(search(arr,target,3,6));
    }

    static int search(int[] arr,int target, int start, int end) {
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;

    }
}
