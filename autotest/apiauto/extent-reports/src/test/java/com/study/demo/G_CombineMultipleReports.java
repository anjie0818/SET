package com.study.demo;

import com.aventstack.extentreports.reporter.JsonFormatter;
import org.junit.Test;

import java.io.IOException;

/**
 * 输出json文件
 */
public class G_CombineMultipleReports extends BaseExtent{
    /**
     * 创建了一个 JsonFormatter，它将完整的实体信息保存为 JSON 文件。
     * Extent.json.第一次调用 createDomainFromJsonArchive 时，不执行任何操作，因为文件是空的。
     * 第二次以后，每当调用这个方法时，它都会读取实体并重新构建它们
     * @throws IOException
     */
    @Test
    public void test1() throws IOException {
        JsonFormatter json = new JsonFormatter("extent.json");
        extent.createDomainFromJsonArchive("extent.json");
        extent.createTest("test1").pass("ok");
        extent.createTest("test2").pass("ok");
        extent.attachReporter(json, spark);

    }

}
