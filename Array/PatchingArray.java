package Array;

public class PatchingArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        int n = 5;
        int ans = minPatches(nums, n);
        System.out.println(ans);
    }
    
    public static int minPatches(int[] nums, int n) {
        int i = 0;
        int totalPatches = 0;
        long sum = nums[0];
        while(sum < n) {
            if(i < nums.length && nums[i]<=sum) {
                sum = sum + nums[i++];
                totalPatches++;
            } else {
                sum = sum + sum;
            }
        }
        return totalPatches-1;
    }
}
