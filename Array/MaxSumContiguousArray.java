package Array;

//Kadanes algorithm
public class MaxSumContiguousArray {
    public static void main(String[] args) {
        int[] arr = new int[] { -1, -2, -3, -4 };
        int res = maxContinuouArraySum(arr);
        System.out.println(res);

    }

    private static int maxContinuouArraySum(int[] arr) {
        int sum = 0;
        int lsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum > lsum) {
                lsum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return lsum;
    }

}
