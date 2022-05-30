package array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int inequality = money - price;
        for (int coin : coins) {
            while (inequality >= coin) {
                rsl[size++] = coin;
                inequality -= coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}