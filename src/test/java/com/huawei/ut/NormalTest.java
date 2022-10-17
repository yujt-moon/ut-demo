package com.huawei.ut;

import org.junit.*;

/**
 * 科目二真题
 *
 * @author yujiangtaoa
 * @date 2022/10/16 下午9:29
 */
public class NormalTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("in before class ...");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("in after class ...");
    }

    @Before
    public void before() {
        System.out.println("in before ...");
    }

    @After
    public void after() {
        System.out.println("in after ...");
    }

    @Test
    public void testMethodA() {
        System.out.println("invoke method A ...");
    }

    @Test
    public void testMethodB() {
        System.out.println("invoke method B ...");
    }

    @Test
    @Ignore("no need to test")
    public void testMethodC() {
        System.out.println("invoke method C ...");
    }
}
