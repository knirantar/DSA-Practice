package TwoDArray;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        int[][] twoDArray = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int k = 14;
        System.out.println(linearSearch(twoDArray, k));
    }

    private static Boolean linearSearch(int[][] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == k) {
                    return true;
                }
            }
        }
        return false;
    }

}
