package com.anbang.server.controller;

import com.anbang.server.bean.AllChannelData;
import com.anbang.server.manager.ChannelManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/4/24.
 */
@RestController
@RequestMapping("channel")
public class ChannelController {
    @Resource
    private ChannelManager channelManager;

    @GetMapping
    public AllChannelData findAll() {
        AllChannelData allChannelData = new AllChannelData();
        allChannelData.setCode(0);
        allChannelData.setChannels(channelManager.findAll());
        return allChannelData;
    }
}
