package com.project.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 购买课程：(PurchaseCourses)表实体类
 *
 */
@TableName("`purchase_courses`")
@Data
@EqualsAndHashCode(callSuper = false)
public class PurchaseCourses implements Serializable {

    // PurchaseCourses编号
    @TableId(value = "purchase_courses_id", type = IdType.AUTO)
    private Integer purchase_courses_id;

    // 课程名称
    @TableField(value = "`course_name`")
    private String course_name;
    // 购买日期
    @TableField(value = "`purchase_date`")
    private Timestamp purchase_date;
    // 购买人数
    @TableField(value = "`number_of_buyers`")
    private Integer number_of_buyers;
    // 购买数量
    @TableField(value = "`purchase_quantity`")
    private Integer purchase_quantity;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
