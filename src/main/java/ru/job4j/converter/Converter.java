package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubbleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float dollarToEuro(float value) {
        float rsl = value * 0.857F;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 1.166F;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubbles are " + euro + " euro.");
        float dollar = Converter.rubbleToDollar(420);
        System.out.println("420 rubbles are " + dollar + " dollars.");
        dollar = Converter.dollarToEuro(12);
        System.out.println("12 dollars are " + dollar + " euros.");
        euro = Converter.euroToDollar(15);
        System.out.println("15 euros are " + euro + " dollars.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euros. Test result : " + passed);
        in = 420;
        expected = 7;
        out = Converter.rubbleToDollar(in);
        passed = expected == out;
        System.out.println("420 rubles are 7 dollars. Test result : " + passed);
        in = 12;
        expected = 10.284F;
        out = Converter.dollarToEuro(in);
        passed = expected == out;
        System.out.println("12 dollars are 10.284 euros. Test result : " + passed);
        in = 15;
        expected = 17.49F;
        out = Converter.euroToDollar(in);
        passed = expected == out;
        System.out.println("15 euros are 17.49 dollars. Test result : " + passed);
    }
}

