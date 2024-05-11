package Array;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr = new int[] { -5, 7, -3, -4, 9, 10, -1, 11 };
        int[] arr2 = new int[] { -5, 17, -3, -14, 9, 20, -1, 111 };
        Arrays.sort(arr);
        Arrays.sort(arr2);
        var li = intersection(arr, arr2);
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }

    }

    private static List<Integer> intersection(int[] arr, int[] arr2) {
        List<Integer> li = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr.length && j < arr2.length) {
            if (arr[i] < arr2[j]) {
                i++;
            } else if (arr[i] > arr2[j]) {
                j++;
            } else {
                li.add(arr[i]);
                j++;
                i++;
            }
        }
        return li;
    }

}
