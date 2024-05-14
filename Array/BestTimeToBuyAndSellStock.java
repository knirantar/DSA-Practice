package Array;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] a = new int[] { 7, 6, 4, 3, 1 };
        System.out.println(maxProfit(a));
    }

    private static int maxProfit(int[] a) {
        int min_price = a[0];
        int max_profit = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min_price) {
                min_price = a[i];
            }
            if (max_profit < a[i] - min_price) {
                max_profit = a[i] - min_price;
            }
        }
        return max_profit;
    }
}
