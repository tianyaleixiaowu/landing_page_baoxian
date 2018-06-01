package com.anbang.server.manager;

import com.anbang.server.model.Url;
import com.anbang.server.repository.UrlRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/4/12.
 */
@Service
public class UrlManager {
    @Resource
    private UrlRepository urlRepository;

    public Url find(String url) {
        return urlRepository.findFirstByUrl(url);
    }
}
