package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second > first && second > third) {
            result = second;
        }

        if (third > first && third > second) {
            result = third;
        }

        if (first == second) {
            result = first;
        }

        if (second == third) {
            result = second;
        }

        if (first == third) {
            result = first;
        }

        return result;
    }
}

