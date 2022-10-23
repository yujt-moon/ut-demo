package com.huawei.ut.matcher;

import static org.hamcrest.CoreMatchers.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author yujiangtaoa
 * @date 2022/10/23 上午10:08
 */
public class MatcherTest {

    @Test
    public void testMatcher() {
        Assert.assertThat(2, is(2));
        MatcherAssert.assertThat(2, is(2));

        MatcherAssert.assertThat("This string", endsWith("string"));
        MatcherAssert.assertThat(123, not(is(345)));
        MatcherAssert.assertThat("foo", CoreMatchers.isA(String.class));
    }
}
