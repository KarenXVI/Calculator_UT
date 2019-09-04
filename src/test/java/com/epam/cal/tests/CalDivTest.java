package com.epam.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalDivTest extends BaseTest {

    @Test
    public void fourDivTwo() {
        long result = calculator.sub(4, 2);
        Assert.assertTrue(result == 2);
    }

}
