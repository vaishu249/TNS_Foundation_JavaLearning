package P33Array;

public class Array_Jagged {
    public static void printArr(int[] []arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int c[][]={{1,2,3},{4,5,6,7,9},{7,8}};
        printArr(c);
    }
}
