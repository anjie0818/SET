package org.study.datadriven;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class JsonTest {

    @Test
    void objectMapper() throws IOException {
        ObjectMapper mapper = new ObjectMapper(new JsonFactory());
        TypeReference<List<HashMap<String, Object>>> typeRef = new TypeReference<List<HashMap<String, Object>>>(){};
        List<HashMap<String, Object>> list = mapper.readValue(new File("src/test/resources/json/orderlist.json"), typeRef);
        System.out.println(list);
    }
    @Test
    void orderLinesTest() throws IOException {
        ObjectMapper mapper = new ObjectMapper(new JsonFactory());
        TypeReference<List<OrderLine>> typeReference =
                new TypeReference<List<OrderLine>>() {};
        //日期相关解析需要该语句
        mapper.findAndRegisterModules();
        List<OrderLine> orderLines =
                mapper.readValue(
                        new File("src/test/resources/json/orderlist.json"),
                        typeReference);

        System.out.println(orderLines);
    }

    /**
     * 解析无规律json
     * @throws IOException
     */
    @Test
    void orderMap() throws IOException {
        ObjectMapper mapper = new ObjectMapper(new JsonFactory());
        TypeReference<HashMap<String, Object>> typeReference =
                new TypeReference<HashMap<String, Object>>() {};
        HashMap<String, Object> stringObjectHashMap =
                mapper.readValue(
                        new File("src/test/resources/json/order.json"),
                        typeReference);

        System.out.println(stringObjectHashMap.toString());
    }

    /**
     * 解析json嵌套
     * @throws IOException
     */
    @Test
    void orderTest() throws IOException {
        ObjectMapper mapper = new ObjectMapper(new JsonFactory());
        TypeReference<Order> typeReference =
                new TypeReference<Order>() {};
        //对应日期解析正常
        mapper.findAndRegisterModules();
        Order order =
                mapper.readValue(
                        new File("src/test/resources/json/order.json"),
                        typeReference);

        System.out.println(order);
    }



}
