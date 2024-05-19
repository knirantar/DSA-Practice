package TwoDArray;

public class PrintWaveLike {
    public static void main(String[] args) {
        int[][] twoDArray = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        printWaveLike(twoDArray);
    }

    private static void printWaveLike(int[][] a) {
        for (int i = 0; i < a[0].length; i++) {
            if (i % 2 == 1) {
                for (int j = a.length - 1; j >= 0; j--) {
                    System.out.println(a[j][i]);
                }
            } else {
                for (int j = 0; j < a.length; j++) {
                    System.out.println(a[j][i]);
                }
            }
        }
    }

}
