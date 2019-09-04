package com.epam.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalSqrtTest extends BaseTest {
    @Test
    public void sqrtNine() {
        double result = calculator.sqrt(9);
        Assert.assertTrue(result == 3);
    }
}
