package com.epam.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalCosTest extends BaseTest {

    @Test
    public void cosFortyfive() {
        double result = calculator.cos(45);
        Assert.assertEquals(result, 0.8509035245341184);
    }
}