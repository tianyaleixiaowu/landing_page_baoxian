package com.anbang.server.manager;

import com.anbang.server.model.Mobile;
import com.anbang.server.repository.MobileRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/4/12.
 */
@Service
public class MobileManager {
    @Resource
    private MobileRepository mobileRepository;
    @Resource
    private InfoManager infoManager;

    public Mobile save(Mobile mobile) {
        //已保存过
        if (infoManager.existMobile(mobile.getPhone())) {
            return null;
        }
        if (mobileRepository.findByPhone(mobile.getPhone()).size() > 0) {
            return null;
        }
        return mobileRepository.save(mobile);
    }
}
