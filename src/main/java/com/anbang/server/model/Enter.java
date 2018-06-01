package com.anbang.server.model;


import com.anbang.server.model.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 用户输入过的手机号
 * @author wuweifeng wrote on 2018/3/5.
 */
@Entity
@Table(name = "enter")
public class Enter extends BaseEntity {
    private byte flag;

    public byte getFlag() {
        return flag;
    }

    public void setFlag(byte flag) {
        this.flag = flag;
    }
}
