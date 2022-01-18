package Arrays;

import java.util.Arrays;

public class duplicateInNPlus1Array {
    public static void main (String [] args) {
        int arr[] = {1,2,4,5,6,4};
        System.out.println(duplicate(arr));
    }
    static int duplicate(int[] arr) {
        int[] copyArr = arr;
        int dupElement = 0;
        Arrays.sort(copyArr);
        System.out.println(Arrays.toString(copyArr));
        for (int i = 0; i < copyArr.length - 1; i++) {
            if(copyArr[i] == copyArr[i + 1]) {
                dupElement = copyArr[i];
            }
        }
        return dupElement;
    }
}
