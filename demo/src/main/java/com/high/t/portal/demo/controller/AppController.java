package com.high.t.portal.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gibson.luo on 2016/10/29.
 */
@Controller
@EnableAutoConfiguration
public class AppController {

    @RequestMapping("/app")
    @ResponseBody
    String list() {
        return "app list";
    }

}
