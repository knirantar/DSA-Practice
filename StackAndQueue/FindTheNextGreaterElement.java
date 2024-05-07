package StackAndQueue;

public class FindTheNextGreaterElement {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9 };
        int[] result = findTheNextGreaterElementArray(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] findTheNextGreaterElementArray(int[] arr) {
        Stack s = new Stack();
        int[] res = new int[arr.length];
        int j = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.top() <= arr[i]) {
                s.pop();
            }
            if (!s.isEmpty()) {
                res[j] = s.top();
                j--;
            } else {
                res[j] = -1;
                j--;
            }
            s.push(arr[i]);
        }
        return res;
    }

}
