package com.high.t.portal.console.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by gibson.luo on 2016/11/1.
 */
@Controller
@EnableAutoConfiguration
public class SystemController {

    private final Environment environment;

    public SystemController(Environment environment) {
        this.environment = environment;
    }

    @RequestMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
}
