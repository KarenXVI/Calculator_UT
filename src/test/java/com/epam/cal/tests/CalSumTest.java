package com.epam.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalSumTest extends BaseTest {
    @Test
    public void towPlusThree() {
        long result = calculator.sum(2, 4);
        Assert.assertTrue(result == 6);
    }
}
