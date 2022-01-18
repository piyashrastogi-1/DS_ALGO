/*
        Given an array arr[] denoting heights of N towers and a positive integer K,
        you have to modify the height of each tower either by increasing or decreasing them by K only once.
        After modifying, height should be a non-negative integer.
        Find out the minimum possible difference of the height of shortest and longest towers after you have modified each tower.
        You can find a slight modification of the problem here.
        Note: It is compulsory to increase or decrease (if possible) by K to each tower.
*/

package Arrays;
import java.util.*;
public class MinMaxDiffBtwHeights {
    static int reSize(int[] arr, int n, int k) {
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] + k;
            if(arr[i] < 0) {
                arr[i] = arr[i] - k;
                arr[i] = arr[i] - k;
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        sum1 = arr[n-1] - arr[0];
        return sum1;
    }
    public static void main(String [] args) {
        int[] arr = {1, 5, 8, 10};
        int k = 2;
        int n = arr.length;
        System.out.println(reSize(arr, n, k));
    }
}
