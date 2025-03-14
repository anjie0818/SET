package com.hogwartsmini.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Table(name = "hogwarts_test_case")
@Data
@ApiModel(value="测试用例对象")
public class HogwartsTestCase extends BaseEntityNew {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="主键",required=true)
    private Integer id;

    /**
     * 测试数据
     */
    @Column(name = "case_data")
    @ApiModelProperty(value="测试数据",required=true)
    private String caseData;

    /**
     * 用例名称
     */
    @Column(name = "case_name")
    @ApiModelProperty(value="用例名称",required=true)
    private String caseName;

    /**
     * 备注
     */
    @ApiModelProperty(value="备注")
    private String remark;

    /**
     * 删除标志 1 未删除 0 已删除
     */
    @Column(name = "del_flag")
    @ApiModelProperty(value="删除标志 1 未删除 0 已删除",required=true)
    private Integer delFlag;

    /**
     * 创建人id
     */
    @Column(name = "create_user_id")
    @ApiModelProperty(value="创建人id",required=true)
    private Integer createUserId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间",required=true)
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @ApiModelProperty(value="更新时间",required=true)
    private Date updateTime;

}
