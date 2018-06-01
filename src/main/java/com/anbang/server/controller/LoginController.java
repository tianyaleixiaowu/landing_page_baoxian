package com.anbang.server.controller;

import com.anbang.server.bean.LoginData;
import com.anbang.server.manager.UserManager;
import com.anbang.server.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/4/16.
 */
@RestController
@RequestMapping("login")
public class LoginController {
    @Resource
    private UserManager userManager;

    @PostMapping
    public LoginData login(User user) {
        return userManager.login(user);
    }

}
