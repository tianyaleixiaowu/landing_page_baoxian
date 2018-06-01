package com.anbang.server.controller;

import com.anbang.server.bean.InfoData;
import com.anbang.server.manager.InfoManager;
import com.anbang.server.model.Info;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/4/12.
 */
@RestController
@RequestMapping("/info")
public class InfoController {
    @Resource
    private InfoManager infoManager;

    //https://gitee.com/lemur/easypoi这个有Excel导出的例子

    @PostMapping
    public InfoData save(Info info) {
        InfoData infoData = new InfoData();
        infoData.setCode(0);
        infoData.setInfo(infoManager.save(info));
        return infoData;
    }

}
