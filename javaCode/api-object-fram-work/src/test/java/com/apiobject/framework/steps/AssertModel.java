/**
 * projectName: apiobject-framwork
 * fileName: AssertModel.java
 * packageName: com.apiobject.framework.steps
 * date: 2021-06-19 下午4:09
 */
package com.apiobject.framework.steps;

import lombok.Data;

/**
 * @version: V1.0
 * @author: kuohai
 * @className: AssertModel
 * @packageName: com.apiobject.framework.steps
 * @description: 用来存储断言数据的对象
 * @data: 2021-06-19 下午4:09
 **/
@Data
public class AssertModel {
    private String actual;
    private String matcher;
    private String expect;
    private String reason;
}