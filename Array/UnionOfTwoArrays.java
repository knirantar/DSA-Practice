package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr = new int[] { -5, 7, -3, -4, 9, 10, -1, 11 };
        int[] arr2 = new int[] { 17, -3, -14, 9, 20, -1, 111,-5 };
        Arrays.sort(arr);
        Arrays.sort(arr2);
        List<Integer> li = union(arr, arr2);
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }
    }

    private static List<Integer> union(int[] arr, int[] arr2) {
        List<Integer> li = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr.length && j < arr2.length) {
            if (arr[i] < arr2[j]) {
                li.add(arr[i]);
                i++;
            } else if (arr[i] > arr2[j]) {
                li.add(arr2[j]);
                j++;
            } else {
                li.add(arr[i]);
                j++;
                i++;
            }
        }
        while (i < arr.length) {
            li.add(arr[i]);
            i++;
        }
        while (j < arr2.length) {
            li.add(arr2[j]);
            j++;
        }
        return li;
    }

}
