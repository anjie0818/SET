/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */

import com.ceshiren.entity.OrderLine;
import com.ceshiren.entity.OrderList;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class CsvUnitTest {

    @Test
    void csvReadWithHeader() throws IOException {
        CsvMapper csvMapper = new CsvMapper();
        //带着header读取
        CsvSchema orderLineSchema = CsvSchema.emptySchema().withHeader();
        //功能上等价的便捷方法： mapper.registerModules(mapper.findModules());
        //我们需要使用 findAndRegisterModules方法，以便 Jackson正确处理我们的日期
        //Jackson也可以自动搜索所有模块，不需要我们手动注册
        csvMapper.findAndRegisterModules();
        MappingIterator<Object> objectMappingIterator = csvMapper.readerFor(OrderLine.class)
                .with(orderLineSchema)
                .readValues(new File("src/test/resources/csv/orderLines.csv"));
        System.out.println(objectMappingIterator.readAll());
    }


    @Test
    void csvReadWithHeader1() throws IOException {
        CsvMapper csvMapper = new CsvMapper();
        //带着header读取
        CsvSchema orderLineSchema = CsvSchema.emptySchema().withHeader();
        //功能上等价的便捷方法： mapper.registerModules(mapper.findModules());
        //我们需要使用 findAndRegisterModules方法，以便 Jackson正确处理我们的日期
        //Jackson也可以自动搜索所有模块，不需要我们手动注册
        csvMapper.findAndRegisterModules();
        MappingIterator<Object> objectMappingIterator = csvMapper.readerFor(OrderList.class)
                .with(orderLineSchema)
                .readValues(new File("src/test/resources/csv/orderLines.csv"));
        System.out.println(objectMappingIterator.readAll());
    }

    @Test
    void csvReadWithHeaderMap() throws IOException {
        CsvMapper csvMapper = new CsvMapper();
        //功能上等价的便捷方法： mapper.registerModules(mapper.findModules());
        //我们需要使用 findAndRegisterModules方法，以便 Jackson正确处理我们的日期
        //Jackson也可以自动搜索所有模块，不需要我们手动注册
        csvMapper.findAndRegisterModules();
        //.setSkipFirstDataRow(true) 第一行header不解析
        CsvSchema schema = CsvSchema.builder().setSkipFirstDataRow(true)
                .addColumn("item")
                .addColumn("quantity")
                .addColumn("unitPrice")
                .addColumn("orderDate")
                .build();
        //readerForMapOf
        MappingIterator<Object> objectMappingIterator = csvMapper.readerForMapOf(String.class)
                // 注意：不需要包装
                .with(schema)
                .readValues(new File("src/test/resources/csv/orderLines.csv"));
        System.out.println(objectMappingIterator.readAll());
    }
    @Test
    void csvReadOutHeader() throws IOException {
        CsvMapper csvMapper = new CsvMapper();

        //功能上等价的便捷方法： mapper.registerModules(mapper.findModules());
        //我们需要使用 findAndRegisterModules方法，以便 Jackson正确处理我们的日期
        //Jackson也可以自动搜索所有模块，不需要我们手动注册
        csvMapper.findAndRegisterModules();
        CsvSchema schema = CsvSchema.builder()
                .addColumn("item")
                .addColumn("quantity")
                .addColumn("unitPrice")
                .addColumn("orderDate")
                .build();
        MappingIterator<Object> objectMappingIterator = csvMapper.readerFor(OrderLine.class)
                .with(schema)
                .readValues(new File("src/test/resources/csv/orderlist.csv"));
        System.out.println(objectMappingIterator.readAll());
    }

    @Test
    void csvReadOutHeader1() throws IOException {
        CsvMapper csvMapper = new CsvMapper();
        //功能上等价的便捷方法： mapper.registerModules(mapper.findModules());
        //我们需要使用 findAndRegisterModules方法，以便 Jackson正确处理我们的日期
        //Jackson也可以自动搜索所有模块，不需要我们手动注册
        csvMapper.findAndRegisterModules();
        CsvSchema schema = CsvSchema.builder()
                .addColumn("item")
                .addColumn("quantity")
                .addColumn("unitPrice")
                .addColumn("orderDate")
                .build();
        MappingIterator<Object> objectMappingIterator = csvMapper.readerFor(OrderList.class)
                .with(schema)
                .readValues(new File("src/test/resources/csv/orderlist.csv"));
        System.out.println(objectMappingIterator.readAll());
    }

    @Test
    void csvReadOutHeaderMap() throws IOException {
        CsvMapper csvMapper = new CsvMapper();
        //功能上等价的便捷方法： mapper.registerModules(mapper.findModules());
        //我们需要使用 findAndRegisterModules方法，以便 Jackson正确处理我们的日期
        //Jackson也可以自动搜索所有模块，不需要我们手动注册
        csvMapper.findAndRegisterModules();
        CsvSchema schema = CsvSchema.builder()
                .addColumn("item")
                .addColumn("quantity")
                .addColumn("unitPrice")
                .addColumn("orderDate")
                .build();
        MappingIterator<Object> objectMappingIterator = csvMapper.readerForMapOf(String.class)
                .with(schema)
                .readValues(new File("src/test/resources/csv/orderlist.csv"));
        System.out.println(objectMappingIterator.readAll());
    }
}
