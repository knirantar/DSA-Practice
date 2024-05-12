package Array;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = new int[] { 3, 5, 5, 7, 12, 19, 23 };
        int[] arr2 = new int[] { -5, -4, -3, -1, 7, 9, 10, 11 };

        int[] ans = mergeTwoArraysWithExtraSpace(arr1, arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    private static int[] mergeTwoArraysWithExtraSpace(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;

        int[] newArray = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                newArray[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                newArray[k++] = arr2[j++];
            } else {
                newArray[k++] = arr1[i++];
            }
        }
        while (i < arr1.length) {
            newArray[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            newArray[k++] = arr2[j++];
        }

        return newArray;
    }
}
