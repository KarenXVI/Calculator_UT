package com.epam.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalCtgTest extends BaseTest {

    @Test
    public void ctgFortyfive() {
        double result = calculator.tg(45);
        Assert.assertEquals(result, 1.0);
    }
}