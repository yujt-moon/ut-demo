package com.huawei.ut;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author yujiangtaoa
 * @date 2022/10/16 下午6:44
 */
public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(6, calculator.add(1, 5));
    }

    @Test
    @Ignore
    public void directFail() {
        //
        Assert.fail();
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideException() {
        calculator.divide(10, 0);
    }

    @Test(timeout = 4000)
    public void testTimeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
