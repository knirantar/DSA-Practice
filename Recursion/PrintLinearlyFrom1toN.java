package Recursion;

public class PrintLinearlyFrom1toN {
    public static void main(String[] args) {
        int n = 0;
        int k = 120;
        printLinearly(n, k);
    }

    private static void printLinearly(int n, int k) {
        if (n == k)
            return;
        System.out.println(n + 1);
        printLinearly(n + 1, k);
    }

}
