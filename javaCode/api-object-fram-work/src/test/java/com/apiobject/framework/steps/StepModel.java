/**
 * projectName: apiobject-framwork
 * fileName: StepModel.java
 * packageName: com.apiobject.framework.steps
 * date: 2021-06-19 下午4:07
 */
package com.apiobject.framework.steps;

import com.apiobject.framework.global.ApiLoader;
import com.apiobject.framework.global.GlobalVariables;
import com.apiobject.utils.PlaceholderUtils;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import lombok.Data;
import org.junit.jupiter.api.function.Executable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * @version: V1.0
 * @author: kuohai
 * @className: StepModel
 * @packageName: com.apiobject.framework.steps
 * @description: step对象
 * @data: 2021-06-19 下午4:07
 **/
@Data
public class StepModel {
    public static final Logger logger = LoggerFactory.getLogger(StepModel.class);

    private String api;
    private String action;
    private ArrayList<String> actualParameter;
    private ArrayList<AssertModel> asserts;
    private HashMap<String,String> save;
    private HashMap<String,String> saveGlobal;

    private ArrayList<String> finalActualParameter =  new ArrayList<>();
    private HashMap<String,String> stepVariable = new HashMap<>();
    private StepResult stepResult =  new StepResult();
    private ArrayList<Executable> assertList = new ArrayList<>();

    public StepResult run(HashMap<String,String> testCaseVariables){
        /**
         * 1、实参占位符替换
         */
        if(actualParameter != null){
            finalActualParameter.addAll(PlaceholderUtils.resolveList(actualParameter,testCaseVariables));
        }
        /**
         * 2、执行action
         */
        Response response = ApiLoader.getAction(api,action).run(finalActualParameter);

        /**
         * 3、存save
         */
        if(save !=null){
            save.forEach((variablesName,path)->{
                String value = response.path(path).toString();
                stepVariable.put(variablesName,value);
                logger.info("step变量更新： "+stepVariable);
            });
        }
        /**
         * 4、存saveGloble
         */
        if(saveGlobal !=null){
            saveGlobal.forEach((variablesName,path)->{
                String value = response.path(path.toString());
                GlobalVariables.getGlobalVariables().put(variablesName,value);
                logger.info("全局变量更新： "+GlobalVariables.getGlobalVariables());
            });
        }
        /**
         * 5、存储断言结果
         */
        if(asserts != null){
            asserts.stream().forEach(assertModel -> {
//                assertList.add(()->{assertThat(assertModel.getReason(),response.path(assertModel.getActual().toString()),equalTo(assertModel.getExpect()));});
            });
        }
        /**
         * 8、组装result
         */
        stepResult.setAssertList(assertList);
        stepResult.setStepVariables(stepVariable);
        return  stepResult;
    }
}