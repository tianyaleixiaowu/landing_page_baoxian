package com.anbang.server.controller;

import com.anbang.server.bean.BaseData;
import com.anbang.server.manager.ClickManager;
import com.anbang.server.model.Click;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/4/12.
 */
@RestController
@RequestMapping("/click")
public class ClickController {
    @Resource
    private ClickManager clickManager;

    @RequestMapping
    public BaseData add(Click click) {
        clickManager.save(click);
        return new BaseData(0, "");
    }
}
