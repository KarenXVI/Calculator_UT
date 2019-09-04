package com.epam.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalSinTest extends BaseTest {

    @Test
    public void sinFortyfive() {
        double result = calculator.sin(45);
        Assert.assertEquals(result, 0.8509035245341184);
    }
}