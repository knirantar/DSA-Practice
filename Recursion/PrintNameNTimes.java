package Recursion;

public class PrintNameNTimes {
    public static void main(String[] args) {
        int n = 0;
        int k = 10;
        printNtimes(n, k);
    }

    private static void printNtimes(int n, int k) {
        if (n == k)
            return;
        System.out.println("Nirantar");
        printNtimes(n + 1, k);
    }

}
