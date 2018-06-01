package com.anbang.server.model;


import com.anbang.server.model.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 * 提交表单
 * @author wuweifeng wrote on 2018/3/5.
 */
@Entity
@Table(name = "info", indexes = {@Index(name = "phone", columnList =
        "phone", unique = true)})
public class Info extends BaseEntity {
    /**
     * 手机号
     */
    private String phone;
    /**
     * 孩子姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 性别1男2女，0不填
     */
    private byte gender;
    /**
     * 校区
     */
    private String school;
    /**
     * 是否在读（0在读，1不在，null不填）
     */
    private Byte inRead;

    @Override
    public String toString() {
        return "Info{" +
                "phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", school='" + school + '\'' +
                ", inRead=" + inRead +
                '}';
    }

    public Byte getInRead() {
        return inRead;
    }

    public void setInRead(Byte inRead) {
        this.inRead = inRead;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
