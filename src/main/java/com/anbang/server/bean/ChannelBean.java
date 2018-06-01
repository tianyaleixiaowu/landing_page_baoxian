package com.anbang.server.bean;

import java.util.List;

/**
 * @author wuweifeng wrote on 2018/4/16.
 */
public class ChannelBean {
    private String original;

    private List<String> channel;

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public List<String> getChannel() {
        return channel;
    }

    public void setChannel(List<String> channel) {
        this.channel = channel;
    }
}
