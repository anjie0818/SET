/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */

import com.ceshiren.entity.OrderLine;
import com.ceshiren.entity.OrderList;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class YamlUnitTest {

    //直接声明数据结构
    @Test
    void listTest() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        //对应的解析类型声明
        TypeReference<List<HashMap<String,Object>>> typeReference =
                new TypeReference<List<HashMap<String, Object>>>() {
        };
        List<HashMap<String, Object>> list =
                objectMapper.readValue(
                        new File("src/test/resources/orderlist.yaml"),
                        typeReference
                );
        System.out.println(list);
    }
    //实体类声明
    @Test
    void orderlistTest() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        //为了正常的处理我们声明的日期
        objectMapper.findAndRegisterModules();
        TypeReference<List<OrderList>>  typeReference =
                new TypeReference<List<OrderList>>() {
                };
        List<OrderList> orderLists = objectMapper.readValue(new File("src/test/resources/orderlist.yaml"), typeReference);
        System.out.println(orderLists);

    }
    //实体类的成员变量与key一一对应
    @Test
    void orderLineTest() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        TypeReference<List<OrderLine>> typeReference =
                new TypeReference<List<OrderLine>>() {
                };
        objectMapper.findAndRegisterModules();
        List<OrderLine> orderLines = objectMapper.readValue(new File("src/test/resources/orderlist.yaml"), typeReference);

        System.out.println(orderLines);
    }
}
