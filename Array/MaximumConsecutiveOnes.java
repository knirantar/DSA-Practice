package Array;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 1, 0, 1, 1, 1 };
        findMaxConsecutiveOnes(a);
    }

    private static void findMaxConsecutiveOnes(int[] a) {
        int maxCount = 0;
        int seq = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                seq++;
            } else {
                if (seq > maxCount) {
                    maxCount = seq;
                }
                seq = 0;
            }
            if (seq > maxCount) {
                maxCount = seq;
            }
        }
        System.out.println(maxCount);
    }

}
