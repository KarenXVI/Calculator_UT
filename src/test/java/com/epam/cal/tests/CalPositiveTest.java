package com.epam.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalPositiveTest extends BaseTest {
    @Test
    public void isPositive() {
        boolean result = calculator.isPositive(6);
        Assert.assertTrue(result == true);
    }
}
