package ru.job4j.condition;

public class Max {

    public int max(int first, int second) {
        boolean condition = first > second;
        int result = condition ? first : second;
        return result;
    }

    public int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public int max(int first, int second, int third, int fourth) {
        return max(first, max(third, second));
    }
}
