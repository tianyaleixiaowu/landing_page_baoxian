package com.anbang.server.controller;

import com.anbang.server.bean.BaseUrlBean;
import com.anbang.server.manager.UrlManager;
import com.anbang.server.model.Url;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * 短信短链接重定向
 * @author wuweifeng wrote on 2018/4/24.
 */
@Controller
public class RedirectController {
    @Resource
    private UrlManager urlManager;

    @RequestMapping("/{s}")
    public String redirect(@PathVariable String s, HttpServletResponse response) throws Exception {
        Url url = urlManager.find(s);
        BaseUrlBean baseUrlBean = new BaseUrlBean();
        BeanUtils.copyProperties(url, baseUrlBean);
        return "redirect:https://mm.jnrise.cn:88/loading/xto4ete.html?sign=" + baseUrlBean.encrypt();
    }


}
