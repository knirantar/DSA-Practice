package BinarySearch;

public class InfiniteArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 10;
        System.out.println(ans(arr, target));
    }

    public static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (arr[end] < target) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] arr, int k, int start, int end) {
        int low = start;
        int high = end;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
