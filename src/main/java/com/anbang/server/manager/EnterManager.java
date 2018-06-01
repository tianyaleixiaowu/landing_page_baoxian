package com.anbang.server.manager;

import com.anbang.server.model.Enter;
import com.anbang.server.repository.EnterRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/4/12.
 */
@Service
public class EnterManager {
    @Resource
    private EnterRepository enterRepository;

    public Enter save(Enter enter) {
        return enterRepository.save(enter);
    }
}
