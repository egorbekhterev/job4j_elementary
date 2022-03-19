package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert420RblThen7Dollar() {
        float in = 420;
        float expected = 7;
        float out = Converter.rubbleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert12DollarThen10dot284Euro() {
        float in = 12;
        float expected = 10.284F;
        float out = Converter.dollarToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert15EuroThen17dot49Dollar() {
        float in = 15;
        float expected = 17.49F;
        float out = Converter.euroToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(out, expected, eps);
    }
}