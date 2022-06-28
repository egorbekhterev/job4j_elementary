package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        Max maxObject = new Max();
        int result = maxObject.max(1, 2);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To1To2Then3() {
        Max maxObject = new Max();
        int result = maxObject.max(3, 1, 2);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To1To2To3Then5() {
        Max maxObject = new Max();
        int result = maxObject.max(4, 1, 2, 3);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To3To2To5THen5() {
        Max maxObject = new Max();
        int result = maxObject.max(5, 3, 2, 5);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }
}