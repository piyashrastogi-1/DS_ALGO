//Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
package Arrays;
import java.util.*;
public class KadanesAlgorithm {
    static long maxSubArraySum(int[] arr) {
        long maxSum = Integer.MIN_VALUE;
        long currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if(currSum > maxSum) {
                maxSum = currSum;
            }
            if(currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        System.out.println(maxSubArraySum(arr));
    }
}
