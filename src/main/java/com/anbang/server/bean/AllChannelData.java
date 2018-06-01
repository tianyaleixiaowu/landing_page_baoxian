package com.anbang.server.bean;


import com.anbang.server.model.Channel;

import java.util.List;

/**
 * @author wuweifeng wrote on 2018/4/24.
 */
public class AllChannelData extends BaseData {
    private List<Channel> channels;

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }
}
