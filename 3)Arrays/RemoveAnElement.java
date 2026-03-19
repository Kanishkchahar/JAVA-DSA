public class RemoveAnElement {
    public static void main(String[] args) {
        int[] arr = new int[50];
        int indextoremove = 20;
        for(int j=0; j<arr.length; j++){
            arr[j] = j;
        }
        for(int i=indextoremove; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        System.out.println(arr[20]);


    }
}
