package com.anbang.server.repository;

import com.anbang.server.model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
public interface ChannelRepository extends JpaRepository<Channel, Long> {
}
