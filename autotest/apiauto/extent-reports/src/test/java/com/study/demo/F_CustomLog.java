package com.study.demo;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.annotations.MarkupIgnore;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class F_CustomLog extends BaseExtent {
    @Test
    public void test1(){
        extent.createTest("GeneratedLog")
                .generateLog(Status.PASS, MarkupHelper.toTable(new MyCustomLog(), "table-sm"));
    }
}

class MyCustomLog {
    private List<Object> names = Arrays.asList("Anshoo", "Extent", "Klov");
    private Object[] favStack = new Object[]{"Java", "C#", "Angular"};
    @MarkupIgnore
    private List<Object> ignored = Arrays.asList("Ignored", "Ignored", "Ignored");
    private Map<Object, Object> items = new HashMap<Object, Object>() {
        {
            put("Item1", "Value1");
            put("Item2", "Value2");
            put("Item3", "Value3");
        }
    };
}
