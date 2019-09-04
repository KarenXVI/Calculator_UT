package com.epam.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalPowTest extends BaseTest {

    @Test
    public void fourPowTwo() {
        long result = calculator.sub(4, 2);
        Assert.assertTrue(result == 2);
    }
}
