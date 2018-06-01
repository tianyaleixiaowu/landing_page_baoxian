package com.anbang.server.model;


import com.anbang.server.model.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 用户输入过的手机号
 * @author wuweifeng wrote on 2018/3/5.
 */
@Entity
@Table(name = "mobile")
public class Mobile extends BaseEntity {
    /**
     * 手机号
     */
    private String phone;

    @Override
    public String toString() {
        return "Mobile{" +
                "phone='" + phone + '\'' +
                '}';
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
