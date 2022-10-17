package com.huawei.ut;

import com.huawei.ut.rule.TemporaryFolderRuleTest;
import com.huawei.ut.rule.TimeoutTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author yujiangtaoa
 * @date 2022/10/16 下午8:57
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TemporaryFolderRuleTest.class,
        CalculatorTest.class,
        IntegerTest.class,
        NormalTest.class,
        TimeoutTest.class
})
public class AllTest {
}
