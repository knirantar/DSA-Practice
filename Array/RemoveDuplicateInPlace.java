package Array;

//Remove duplicate inplace in sorted array
public class RemoveDuplicateInPlace {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 1, 1, 2, 2, 3, 4, 4, 4, 5 };
        removeDuplicates(a);
    }

    private static void removeDuplicates(int[] a) {
        int i = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] != a[i]) {
                i = i + 1;
                a[i] = a[j];
            }
        }
        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k]);
        }
    }

}
