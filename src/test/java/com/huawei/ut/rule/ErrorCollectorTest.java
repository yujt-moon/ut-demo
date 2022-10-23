package com.huawei.ut.rule;

import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.*;

/**
 * @author yujiangtaoa
 * @date 2022/10/23 上午9:55
 */
public class ErrorCollectorTest {

    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void testErrorCollector() {
        collector.addError(new NullPointerException("不能为空"));
        collector.addError(new IllegalArgumentException("参数异常"));

//        collector.checkThat();
    }
}
