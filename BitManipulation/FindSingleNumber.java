package BitManipulation;

public class FindSingleNumber {
    public static void main(String[] args) {
        int[] a = new int[] { 4, 2, 2, 3, 3, 5, 7, 7, 5 };
        int xor = 0;
        for (int i = 0; i < a.length; i++) {
            xor = xor ^ a[i];
        }
        System.out.println(xor);
    }

}
