package com.anbang.server.model;


import javax.persistence.*;

/**
 * 用户输入过的手机号
 * @author wuweifeng wrote on 2018/3/5.
 */
@Entity
@Table(name = "channel")
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String channel;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
