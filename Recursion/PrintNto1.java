package Recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        int n = 20;
        int k = 0;
        printNto1(n, k);
    }

    private static void printNto1(int n, int k) {
        if (n == k)
            return;
        System.out.println(n);
        printNto1(n - 1, k);
    }

}
