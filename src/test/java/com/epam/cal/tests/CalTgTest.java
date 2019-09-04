package com.epam.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalTgTest extends BaseTest {

    @Test
    public void tgFortyfive() {
        double result = calculator.ctg(45);
        Assert.assertEquals(result, 1.0);
    }
}
