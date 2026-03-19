public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {18,43,6,3,2,5,7,62,65};
        int target =  62;
        int index = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                index = i;
                break;
            }
        }
        if (index != -1) System.out.println("Index of "+target+" is : "+index);
        else System.out.println("Element is not in array.");
        }

    }

