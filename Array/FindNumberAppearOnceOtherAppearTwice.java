package Array;

public class FindNumberAppearOnceOtherAppearTwice {
    public static void main(String[] args) {
        int[] a = new int[] { 4, 1, 2, 1, 2 };
        // We can use hashmap and then compare values with 1 return its key
        // We can use xor as well

        findSingleNumber(a);
    }

    private static void findSingleNumber(int[] a) {
        int xor = 0;
        for (int i = 0; i < a.length; i++) {
            xor = xor ^ a[i];
        }
        System.out.println(xor);
    }

}
