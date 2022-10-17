package com.huawei.ut;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author yujiangtaoa
 * @date 2022/10/16 下午8:56
 */
public class IntegerTest {

    /**
     * 科目二相关题目，测试Integer是否相等
     */
    @Test
    public void testEquals() {
        Integer i1 = Integer.valueOf("5");
        Integer i2 = Integer.valueOf(5);
        Integer i3 = new Integer(5);
        Integer i4 = 5;


        Assert.assertSame("i1和i2是一个对象",i1, i2);
        Assert.assertNotSame(i1, i3);
        Assert.assertTrue(i1 == i4);
    }
}
