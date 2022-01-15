package Arrays;
import java.util.*;
public class Union_Intersection {
    static int union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.print("Union Array " + set.toString());
        System.out.println();
        return set.size();
    }
    static int intersection(int[] arr1, int[] arr2) {
        int[] newArray = new int[Math.min(arr1.length, arr2.length)];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if(arr1[i] == arr2[j]) {
                    count++;
                    System.out.print(arr2[j] + " ");

                }
            }
        }
        System.out.println("");
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {12,2,5,7,8};
        int[] arr2 = {1,2,5,4};
        System.out.println("Union Array Size " + union(arr1, arr2));
        System.out.print("Intersection Array ");
        System.out.println("Intersection Array Size " + intersection(arr1, arr2));
    }
}
