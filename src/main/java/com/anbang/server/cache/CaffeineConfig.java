package com.anbang.server.cache;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/4/16.
 */
@Component
@EnableCaching
public class CaffeineConfig {
    @Resource
    private CacheManager cacheManager;

    @Bean
    public Cache cache() {
         return cacheManager.getCache("token_cache");
    }

}
