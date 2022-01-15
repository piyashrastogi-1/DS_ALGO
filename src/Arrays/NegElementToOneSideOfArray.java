
/* Move all negative numbers to beginning and positive to end with constant extra space */

package Arrays;

import java.util.Arrays;

public class NegElementToOneSideOfArray {
    static void display(int[] arr, int start, int end ) {
        int temp = 0;
        int j = 0;
//        Arrays.sort(arr);
        for (int i = start; i < end; i++) {
            if(arr[i] < 0) {
                if(i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        int[] arr = {-1,1,-3,-4,5,4,6,-2};
        display(arr, 0, arr.length);
    }
}
