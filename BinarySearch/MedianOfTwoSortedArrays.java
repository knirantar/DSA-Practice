package BinarySearch;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 3, 5, 6, 7, 10, 12 };
        int[] arr2 = new int[] { 2, 3, 6, 15 };
        double result = findMedianOfBothArrays(arr1, arr2);
        System.out.println(result);
    }

    private static double findMedianOfBothArrays(int[] arr1, int[] arr2) {
        int totalLength = arr1.length + arr2.length;
        int[] mergedArray = new int[totalLength];

        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        if (totalLength % 2 == 0) {
            int mid1 = mergedArray[(totalLength / 2) - 1];
            int mid2 = mergedArray[totalLength / 2];
            return (double) (mid1 + mid2) / 2;
        } else {
            return (double) mergedArray[totalLength / 2];
        }
    }

}
