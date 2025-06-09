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
 * 教师信息：(TeacherInformation)表实体类
 *
 */
@TableName("`teacher_information`")
@Data
@EqualsAndHashCode(callSuper = false)
public class TeacherInformation implements Serializable {

    // TeacherInformation编号
    @TableId(value = "teacher_information_id", type = IdType.AUTO)
    private Integer teacher_information_id;

    // 教师姓名
    @TableField(value = "`teacher_name`")
    private String teacher_name;
    // 教师头像
    @TableField(value = "`teachers_portrait`")
    private String teachers_portrait;
    // 教师等级
    @TableField(value = "`teacher_level`")
    private String teacher_level;
    // 资历
    @TableField(value = "`qualifications`")
    private String qualifications;
    // 主讲课程
    @TableField(value = "`lecture_course`")
    private String lecture_course;
    // 从业经验
    @TableField(value = "`experience`")
    private String experience;
    // 教学领域
    @TableField(value = "`teaching_field`")
    private String teaching_field;
    // 个人简介
    @TableField(value = "`personal_profile`")
    private String personal_profile;

    // 点击数
    @TableField(value = "hits")
    private Integer hits;

    // 点赞数
    @TableField(value = "praise_len")
    private Integer praise_len;








    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
