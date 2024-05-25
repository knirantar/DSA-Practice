package Array;

/*
 * Problem Statement: Given an array, print all the elements which are leaders. 
 * A Leader is an element that is greater than all of the elements on its right side in the array.
 */
public class LeaderInArray {
    public static void main(String[] args) {
        int[] a = new int[] { 10, 22, 12, 3, 0, 6 };

        findLeaders(a);
    }

    private static void findLeaders(int[] a) {

        int max = a[a.length - 1];
        System.out.println(max);
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] > max) {
                max = a[i];
                System.out.println(max);
            }
        }
    }

}
