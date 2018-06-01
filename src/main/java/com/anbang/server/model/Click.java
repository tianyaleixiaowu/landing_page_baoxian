package com.anbang.server.model;


import com.anbang.server.model.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author wuweifeng wrote on 2018/5/4.
 */
@Entity
@Table(name = "click")
public class Click extends BaseEntity {
    private String uuid;
    /**
     * 1 mobile  0 web
     */
    private byte deviceType;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public byte getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(byte deviceType) {
        this.deviceType = deviceType;
    }
}
