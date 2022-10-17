package com.huawei.ut.rule;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;

/**
 * @author yujiangtaoa
 * @date 2022/10/16 下午10:23
 */
public class TemporaryFolderRuleTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testFile() throws Exception {
        File testFolder = temporaryFolder.newFolder("TestFolder");
        File file = temporaryFolder.newFile("test.txt");
        Assert.assertTrue(testFolder.exists());
        Assert.assertTrue(file.exists());
    }
}
