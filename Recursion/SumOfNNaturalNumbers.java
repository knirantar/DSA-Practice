package Recursion;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        int n = 5;
        int res = sumOfNaturalNumbers(n);
        System.out.println(res);
        parameterisedSumOfNaturalNumbers(n, 0);

    }

    /* Functional recursion */
    private static int sumOfNaturalNumbers(int n) {
        if (n == 0)
            return 0;

        return n + sumOfNaturalNumbers(n - 1);
    }

    /* Parameterised Recursion */
    private static void parameterisedSumOfNaturalNumbers(int n, int i) {
        if (n < 1) {
            System.out.println(i);
            return;
        }
        parameterisedSumOfNaturalNumbers(n - 1, i + n);
    }

}
