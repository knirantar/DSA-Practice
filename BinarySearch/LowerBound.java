package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 5, 7, 12, 19, 21, 26, 43, 87 };
        int n = arr.length;
        int x = 17;

        int idx = lowerBound(arr, 0, n - 1, x);
        System.out.println("Lower Bound is " + idx);
    }

    public static int lowerBound(int[] arr, int low, int high, int x) {
        int ans = -1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] > x) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }

}
