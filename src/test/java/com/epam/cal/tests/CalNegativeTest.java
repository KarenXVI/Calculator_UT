package com.epam.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalNegativeTest extends BaseTest {
    @Test
    public void isNegative() {
        boolean result = calculator.isNegative(-6);
        Assert.assertTrue(result == true);
    }
}