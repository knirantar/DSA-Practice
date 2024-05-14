package Array;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 12, 3, 5, 7, 19, 23, 5 };

        System.out.println(findDuplicate(arr));
    }

    private static int findDuplicate(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                return arr[i];
            } else {
                map.put(arr[i], i);
            }
        }
        return -1;
    }

}
