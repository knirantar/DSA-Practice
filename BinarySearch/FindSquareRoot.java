/*
 * Find the square root of a number using Binary Search
 * 
 */

package BinarySearch;

public class FindSquareRoot {
    public static void main(String[] args) {
        int number = 29;
        int sq = sqrt(number);
        System.out.println(sq);
    }

    public static int sqrt(int number) {
        int low = 1;
        int high = number;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid == number)
                return mid;
            else if (mid * mid > number) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }

        }
        return ans;
    }

}
