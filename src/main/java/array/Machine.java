package array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int inequality = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (inequality >= coins[i]) {
                rsl[size++] = coins[i];
                inequality -= coins[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
