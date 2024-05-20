package TwoDArray;

public class RowWithMaximumOnes {
    public static void main(String[] args) {
        int[][] a = {
                { 0, 0, 1, 1 },
                { 0, 1, 1, 1 },
                { 0, 0, 0, 0 },
                { 1, 1, 1, 1 }
        };

        findRowWithMaximumOnes(a);
    }

    private static void findRowWithMaximumOnes(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;
        int maxCount = -1;
        int index = -1;
        for (int i = 0; i < rows; i++) {
            int ans = lb(a[i], 1);
            if (ans < cols && cols - ans > maxCount) {
                maxCount = cols - ans;
                index = i;
            }
        }
        System.out.println(index);
    }

    private static int lb(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < x) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }

}
