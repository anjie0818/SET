package com.study.demo;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.annotations.MarkupIgnore;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class H_MarkupSystem extends BaseExtent{
    /**
     * Table表格
     */
    @Test
    public void test1(){
        // create table as a custom log
        extent.createTest("GeneratedLog")
                .generateLog(Status.FAIL, MarkupHelper.toTable(new MyCustomLog(), "table-sm"));

        // or as a predefined one:
//        extent.createTest("Log").fail(MarkupHelper.toTable(new MyCustomLog(), "table-sm"));
    }
    /**
     * CodeBlock xml
     */
    @Test
    public void test2(){
        String code = "<root>" +
                "\n  <Person>" +
                "\n    <Name>Joe Doe</Name>" +
                "\n    <StartDate>2007-01-01</StartDate>" +
                "\n    <EndDate>2009-01-01</EndDate>" +
                "\n    <Location>London</Location>" +
                "\n  </Person>" +
                "\n</root>";
        Markup m = MarkupHelper.createCodeBlock(code);
        extent.createTest("xml").info(m);
    }
    /**
     * CodeBlock json
     */
    @Test
    public void test3(){
        String json = "{'foo' : 'bar', 'foos' : ['b','a','r'], 'bar' : {'foo':'bar', 'bar':false,'foobar':1234}}";
        extent.createTest("json").pass(MarkupHelper.createCodeBlock(json, CodeLanguage.JSON));
    }
    /**
     * CodeBlock 多个 codebolocks
     */
    @Test
    public void test4(){
        String code = "<root>" +
                "\n  <Person>" +
                "\n    <Name>Joe Doe</Name>" +
                "\n    <StartDate>2007-01-01</StartDate>" +
                "\n    <EndDate>2009-01-01</EndDate>" +
                "\n    <Location>London</Location>" +
                "\n  </Person>" +
                "\n</root>";

        Markup m = MarkupHelper.createCodeBlock(code, code,code);
        // or:
        // Markup m = MarkupHelper.createCodeBlocks(new String[] { code,code});
        extent.createTest("json").pass(m);
    }
    /**
     *  List 清单
     */
    @Test
    public void test5(){
        // 有序
        List<Object> items = Arrays.asList(new Object[] { "Item1", "Item2", "Item3" });
        extent.createTest("Test").info(MarkupHelper.createOrderedList(items));
        // 无序
        Map<Object, Object> itemMap = new HashMap<Object, Object>()
        {{
            put("Item1", "Value1");
            put("Item2", "Value2");
            put("Item3", "Value3");
        }};
        extent.createTest("Test").info(MarkupHelper.createUnorderedList(itemMap).getMarkup());
    }

    /**
     * 标签
     */
    @Test
    public void test6(){
        extent.createTest("label").info(MarkupHelper.createLabel("Extent", ExtentColor.BLUE));
    }
}
class MyCustomLog2 {
    private List<Object> names = Arrays.asList("Anshoo", "Extent", "Klov");
    private Object[] favStack = new Object[]{"Java", "C#", "Angular"};

    @MarkupIgnore
    private List<Object> ignored = Arrays.asList("Anshoo/Ignore", "Extent/Ignore", "Klov/Ignore");
    private Map<Object, Object> items = new HashMap<Object, Object>() {
        {
            put("Item1", "Value1");
            put("Item2", "Value2");
            put("Item3", "Value3");
        }
    };
}