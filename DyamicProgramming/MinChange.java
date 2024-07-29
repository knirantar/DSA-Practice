package DyamicProgramming;

import java.util.HashMap;

public class MinChange {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 5, 25 };
        int target = 100;
        // System.out.println(minChange(a, target));
        System.out.println(minChangeMemo(a, target, new HashMap<>()));
    }

    public static int minChange(int[] coin, int amount) {
        if (amount == 0)
            return 0;
        if (amount < 0)
            return -1;
        int minCoins = -1;
        for (int i = 0; i < coin.length; i++) {
            int subAmount = amount - coin[i];
            int res = minChange(coin, subAmount);
            if (res != -1) {
                int numCoins = res + 1;
                if (numCoins < minCoins || minCoins == -1) {
                    minCoins = numCoins;
                }
            }
        }
        return minCoins;
    }

    public static int minChangeMemo(int[] coin, int amount, HashMap<Integer, Integer> map) {
        if (map.containsKey(amount))
            return map.get(amount);
        if (amount == 0)
            return 0;
        if (amount < 0)
            return -1;
        int minCoins = -1;
        for (int i = 0; i < coin.length; i++) {
            int subAmount = amount - coin[i];
            int res = minChangeMemo(coin, subAmount, map);
            if (res != -1) {
                int numCoins = res + 1;
                if (numCoins < minCoins || minCoins == -1) {
                    minCoins = numCoins;
                }
            }
        }
        map.put(amount, minCoins);
        return minCoins;
    }

}
