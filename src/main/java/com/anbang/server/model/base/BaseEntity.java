package com.anbang.server.model.base;


import com.anbang.server.bean.BaseUrlBean;

import javax.persistence.*;
import java.util.Date;

/**
 * @author wuweifeng wrote on 2017/10/25.
 */
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 渠道
     */
    private String channel;
    /**
     * 来源app、web
     */
    private String original;

    private String type1;

    private String type2;

    private Date createTime = new Date();

    private Date updateTime = new Date();

    /**
     * 对4个属性进行的签名，不需要入库
     */
    @Transient
    private String sign;

    public void setSign(String sign) {
        //如果客户端传来的有sign，我们就去解析
        if (sign != null) {
            BaseUrlBean baseUrlBean = new BaseUrlBean().decrypt(sign);
            this.channel = baseUrlBean.getChannel();
            this.original = baseUrlBean.getOriginal();
            this.type1 = baseUrlBean.getType1();
            this.type2 = baseUrlBean.getType2();
        }
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                ", channel='" + channel + '\'' +
                ", original='" + original + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public String getSign() {
        return sign;
    }



    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
