package com.anbang.server.model;


import com.anbang.server.model.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 短链接
 * @author wuweifeng wrote on 2018/3/5.
 */
@Entity
@Table(name = "url")
public class Url extends BaseEntity {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
