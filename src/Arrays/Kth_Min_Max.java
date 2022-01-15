package Arrays;

import java.util.*;


public class Kth_Min_Max {
    private static int kth_Min(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }
    private static int Kth_Max(int[] arr, int k) {
//         Arrays.sort(new int[][]{arr}, Collections.reverseOrder());
        Arrays.sort(arr);
        return arr[(arr.length-k)];

    }
    public static void main(String[] args) {
        int[] arr = {100,200,150,110,80,500,300,250,90,260};
        int k = 3;
        int kth_Min_Element = kth_Min(arr, k);
        int kth_Max_Element = Kth_Max(arr, k);

        System.out.println("Kth Min Element in an Array = " + kth_Min_Element);
        System.out.println("Kth Max Element in an Array = " + kth_Max_Element);
    }
}
