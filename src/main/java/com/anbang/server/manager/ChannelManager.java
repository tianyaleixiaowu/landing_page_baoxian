package com.anbang.server.manager;

import com.anbang.server.model.Channel;
import com.anbang.server.repository.ChannelRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wuweifeng wrote on 2018/4/24.
 */
@Service
public class ChannelManager {
    @Resource
    private ChannelRepository channelRepository;

    public List<Channel> findAll() {
        return channelRepository.findAll();
    }

    public Map<String, String> findName() {
        List<Channel> channels = findAll();
        Map<String, String> map = new HashMap<>();
        for (Channel channel : channels) {
            map.put(channel.getChannel(), channel.getName());
        }
        return map;
    }
}
