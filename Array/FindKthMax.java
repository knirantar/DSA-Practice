
/*
 * K’th Smallest/Largest Element in Unsorted Array
 * 
 */
package Array;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthMax {
    public static void main(String[] args) {
        int[] arr = new int[] { 12, 3, 5, 7, 19, 23 };
        int kthsmallest = findKthMax(arr, 5);
        System.out.println(kthsmallest);

    }

    private static int findKthMax(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int l = k - 1;
        while (l > 0) {
            pq.poll();
            l--;
        }
        return pq.peek();
    }

}
