package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double deductAndDiv(double first, double second) {
        return deduction(first, second) + dividing(first, second);
    }

    public static double sumOfFourOperations(double first, double second) {
        return sum(first, second) + multiply(first, second) + deduction(first, second) + dividing(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчёта равен: " + deductAndDiv(20, 10));
        System.out.println("Результат расчёта равен: " + sumOfFourOperations(20, 10));
    }
}
