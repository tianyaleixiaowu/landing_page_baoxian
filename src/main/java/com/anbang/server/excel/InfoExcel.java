package com.anbang.server.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wuweifeng wrote on 2018/4/16.
 */
public class InfoExcel implements Serializable {
    /**
     * 手机号
     */
    @Excel(name = "电话", height = 20, width = 30, isImportField = "true_st")
    private String phone;
    /**
     * 孩子姓名
     */
    @Excel(name = "姓名", height = 20, width = 30, isImportField = "true_st")
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 性别1男2女，0不填
     */
    @Excel(name = "性别", replace = {"男_1", "女_2", "未知_0"}, isImportField = "true_st")
    private byte gender;
    /**
     * 校区
     */
    @Excel(name = "校区", height = 20, width = 30, isImportField = "true_st")
    private String school;
    /**
     * 渠道
     */
    @Excel(name = "渠道", height = 20, width = 30, isImportField = "true_st")
    private String channel;
    /**
     * 来源app、web
     */
    @Excel(name = "来源", height = 20, width = 30, isImportField = "true_st")
    private String original;

    @Excel(name = "type1", height = 20, width = 30, isImportField = "true_st")
    private String type1;

    @Excel(name = "type2", height = 20, width = 30, isImportField = "true_st")
    private String type2;
    @Excel(name = "日期", databaseFormat = "yyyyMMddHHmmss", format = "yyyy-MM-dd")
    private Date createTime;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
