package com.high.t.portal.console.controller;

import com.high.t.portal.console.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by gibson.luo on 2016/11/1.
 */
@Controller
@EnableAutoConfiguration
public class SystemController {

    private static Logger logger =  LoggerFactory.getLogger(SystemController.class);

    private final Environment environment;

    @Autowired
    private CustomerRepository repository;

    public SystemController(Environment environment) {
        this.environment = environment;
    }

    @RequestMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("index");
    }

    @RequestMapping("/count")
    @ResponseBody
    public Long count(){
        return repository.count();
    }
}
