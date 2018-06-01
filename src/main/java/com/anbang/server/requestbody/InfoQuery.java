package com.anbang.server.requestbody;

import java.util.List;

/**
 * 条件查询info
 * @author wuweifeng wrote on 2018/4/16.
 */
public class InfoQuery {
    private String begin;

    private String end;

    private String original;

    private List<String> channels;

    private String channelsStr;

    private Integer page;

    private Integer size;

    public String getChannelsStr() {
        return channelsStr;
    }

    public void setChannelsStr(String channelsStr) {
        this.channelsStr = channelsStr;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public List<String> getChannels() {
        return channels;
    }

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
