package Array;

public class MaximumProductSubarray {

    public static void main(String[] args) {
        int[] arr = new int[] { -2, 0, -1 };
        int res = maxContinuouArrayProduct(arr);
        System.out.println(res);

    }

    /*
     * 1. All array elements are positive - multiply all
     * 2. Even negative numbers - multiply all
     * 3. Odd negative numbers
     * 4. Has zeros
     */
    private static int maxContinuouArrayProduct(int[] arr) {
        int pre = 1;
        int suff = 1;
        int maxProd = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            pre = pre * arr[i];
            suff = suff * arr[n - i - 1];

            if (pre > maxProd) {
                maxProd = pre;
            }
            if (suff > maxProd) {
                maxProd = suff;
            }
            if (pre == 0)
                pre = 1;
            if (suff == 0)
                suff = 1;

        }

        return maxProd;
    }

}
