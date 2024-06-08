package Array;

public class BinarySubarraysWithSumK {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 0, 1, 0, 1 };
        System.out.println(numSubarraysWithSum(a, 2));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int ans = func(nums, goal) - func(nums, goal-1);
        return ans;

    }
    public static int func(int[] nums, int goal){
        int l = 0;
        int r = 0;
        int sum = 0;
        int count = 0 ;
        int n = nums.length;
        if(goal < 0) return 0;
        while(r < n) 
        {
            sum = sum + nums[r];
            while(sum > goal) {
                sum = sum - nums[l];
                l++;
            }
            count = count + (r-l+1);
            r++;
        }
        return count;
    }

}
