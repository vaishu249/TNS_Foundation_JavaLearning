package P33Array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int intArr[]={84,5,6,7,8};
        System.out.println(Arrays.toString(intArr));
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]+" ");
        }
        //sort
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        //Binary search
        System.out.println(Arrays.binarySearch(intArr,13));

        //copy of existing array
         int intArr2[]=Arrays.copyOf(intArr,3);
        System.out.println(Arrays.toString(intArr2));

        //Fill method
        Arrays.fill(intArr2,999);
        System.out.println(Arrays.toString(intArr2));
    }
}
