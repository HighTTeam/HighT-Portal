package com.high.t.portal.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by gibson.luo on 2016/10/29.
 */
@SpringBootApplication
public class Application {

    private static Logger logger =  LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.debug("HighT Portal server ready ...");
    }

}
