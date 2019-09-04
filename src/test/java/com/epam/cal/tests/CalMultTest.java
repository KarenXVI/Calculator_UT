package com.epam.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalMultTest extends BaseTest {

    @Test
    public void twoMultThree() {
        long result = calculator.mult(2, 3);
        Assert.assertTrue(result == 6);
    }
}
