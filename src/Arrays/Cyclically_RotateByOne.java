package Arrays;

import java.util.Arrays;

public class Cyclically_RotateByOne {
    static void cyclicRotateByOne(int[] arr, int n) {
        int temp = arr[n-1];
        for(int i = n-1; i >= 1; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int[] arr = {3,7,5,8,5,8,4,9,4};
        cyclicRotateByOne(arr, arr.length);
    }
}
