package ru.job4j.condition;

public class Max {

    public int max(int first, int second) {
        boolean condition = first > second;
        int result = condition ? first : second;
        return result;
    }

    public int max(int first, int second, int third) {
        int tmp = max(second, third);
        return max(first, tmp);
    }

    public int max(int first, int second, int third, int fourth) {
        int tmp = max(second, third, fourth);
        return max(first, tmp);
    }
}
