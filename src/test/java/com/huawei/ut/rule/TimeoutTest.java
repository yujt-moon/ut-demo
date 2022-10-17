package com.huawei.ut.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

/**
 * @author yujiangtaoa
 * @date 2022/10/4 下午5:13
 */
public class TimeoutTest {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

    @Test
    public void testWithTimeout() throws Exception {
        TimeUnit.SECONDS.sleep(11);
    }

    @Test(timeout = 12 * 1000)
    public void testWithLocalTimeout() throws Exception {
        TimeUnit.SECONDS.sleep(11);
    }

    @Test(timeout = 8 * 1000)
    public void testWithTimeout3() throws Exception {
        TimeUnit.SECONDS.sleep(9);
    }
}
