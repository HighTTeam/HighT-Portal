package com.high.t.portal.console.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by gibson.luo on 2016/11/2.
 */
@RequestMapping("/domain")
@Controller
@EnableAutoConfiguration
public class DomainController {

    private static Logger logger =  LoggerFactory.getLogger(DomainController.class);

    private final Environment environment;

    public DomainController(Environment environment) {
        this.environment = environment;
    }

    @RequestMapping("/edit")
    public ModelAndView edit(){
        return new ModelAndView("domain/edit");
    }
}

