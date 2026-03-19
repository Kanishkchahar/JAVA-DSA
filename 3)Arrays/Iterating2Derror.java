public class Iterating2Derror {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[1].length; j++){
                System.out.print("("+i +","+ j+")"+ "; ");
            }
        }
    }
}
