package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 10;
        double ac = 15;
        double bc = 20;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotExist() {
        double ab = 3;
        double ac = 15;
        double bc = 20;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}