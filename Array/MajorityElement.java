package Array;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem Statement: Given an array of N integers, write a program to return an element 
 * that occurs more than N/2 times in the given array. You may consider that such an element always exists in the array.
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] a = new int[] { 2, 2, 2, 4, 1, 3, 3, 4, 4, 4, 4, 4, 4 };
        int res = findMajorityOptimal(a);
        System.out.println(res);

    }

    private static int findMajorityElement(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            if (val > a.length / 2) {
                return key;
            }
        }
        return -1;
    }

    private static int findMajorityOptimal(int[] a) {
        int count = 0;
        int curr = 0;
        for (int i = 0; i < a.length; i++) {
            if (count == 0) {
                count = 1;
                curr = a[i];
            } else if (curr == a[i]) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0; i < a.length; i++) {
            if (curr == a[i])
                count1++;
        }
        if (count1 > a.length / 2) {
            return curr;
        }
        return -1;
    }

}
