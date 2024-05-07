/*
 * Each student gets at least one book
 * Each book should be allocated to only one student
 * Book allocation should be in contigous manner
 * Allocated such that maximum number of pages assigned to one student is minimum
 * 
 * Painters partition / Split array largest sum
 * Split the array into k subarray such that the maximum sum is minimum
 * 
 */
package BinarySearch;

public class BookAllocationProblem {
    public static void main(String[] args) {
        int arr[] = new int[] { 25, 35, 28, 49, 9 };
        int students = 4;
        int maxPagesAllocated = findMaximumNumberOfPagesWhichAreMinimum(arr, students);
        System.out.println(maxPagesAllocated);

    }

    private static int findMaximumNumberOfPagesWhichAreMinimum(int[] arr, int students) {
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
            sum = sum + arr[i];
        }
        int low = maxNumber;
        int high = sum;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (students > (canBeAllocated(arr, mid))) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;

    }

    private static int canBeAllocated(int[] arr, int mid) {
        int student = 0, studentPages = 0;
        ;
        for (int i = 0; i < arr.length; i++) {
            if (studentPages + arr[i] <= mid) {
                studentPages = studentPages + arr[i];
            } else {
                student++;
                studentPages = arr[i];
            }
        }
        return student;
    }

}
