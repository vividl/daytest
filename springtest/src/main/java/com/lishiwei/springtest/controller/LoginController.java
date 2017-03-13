package com.lishiwei.springtest.controller;

import com.lishiwei.springtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lishiwei on 17-3-13.
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    public String loginPage() {
        return "login";
    }
}
