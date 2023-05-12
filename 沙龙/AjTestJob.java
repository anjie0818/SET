package org.playground.ajtest.entity;

import java.util.Date;
import java.lang.Double;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;
import java.util.List;
import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import org.playground.ajtest.entity.BaseCustomEntity;
import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import com.diboot.core.util.D;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
* 测试任务 Entity定义
* @author anjie
* @version 1.0
* @date 2023-03-09
* Copyright © anjieCR
*/
@Getter @Setter @Accessors(chain = true)
@TableName("aj_test_job")
public class AjTestJob extends BaseCustomEntity {
    private static final long serialVersionUID = 209465093763623503L;

    /**
    * type字段的关联字典
    */
    public static final String DICT_TEST_TYPE = "TEST_TYPE";

    /**
    * mode字段的关联字典
    */
    public static final String DICT_TEST_MODE = "TEST_MODE";

    /**
    * 测试任务名称 
    */
    @NotNull(message = "测试任务名称不能为空")
    @Length(max=100, message="测试任务名称长度应小于100")
    @BindQuery(comparison = Comparison.LIKE)
    @TableField()
    private String name;

    /**
    * 归属项目 
    */
    @NotNull(message = "归属项目不能为空")
    @TableField()
    private Long systemId;

    /**
    * 任务类型 
    */
    @NotNull(message = "任务类型不能为空")
    @Length(max=100, message="任务类型长度应小于100")
    @TableField()
    private String type;

    /**
    * 模式 
    */
    @NotNull(message = "模式不能为空")
    @Length(max=100, message="模式长度应小于100")
    @TableField()
    private String mode;

    /**
    * 描述 
    */
    @Length(max=100, message="描述长度应小于100")
    @TableField()
    private String descr;

    /**
    * 执行引擎 
    */
    @NotNull(message = "执行引擎不能为空")
    @TableField()
    private Long jenkinsId;

    /**
    * 执行脚本 
    */
    @NotNull(message = "执行脚本不能为空")
    @Length(max=1000, message="执行脚本长度应小于1000")
    @TableField()
    private String jenkinsFile;

    /**
    * 创建人 
    */
    @TableField(fill = FieldFill.INSERT)
    private Long createBy;

    /**
    * 更新人 
    */
    @TableField(fill = FieldFill.UPDATE)
    private Long updateBy;

    /**
    * 更新时间 
    */
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;


} 
