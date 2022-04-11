package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {

    @Test
    public void turnEvenArray() {
        int[] inputArray = new int[] {4, 1, 6, 2};
        int[] resultArray = Turn.back(inputArray);
        int[] expectedArray = new int[] {2, 6, 1, 4};
        Assert.assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void turnNotEvenArrat() {
        int[] inputArray = new int[] {1, 2, 3, 4, 5};
        int[] resultArray = Turn.back(inputArray);
        int[] expectedArray =  new int[] {5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expectedArray, resultArray);
    }
}