package com.springbootlogback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service/logback")
public class LogbackController {

    private static final Logger logger = LoggerFactory.getLogger(LogbackController.class);

    @GetMapping("")
    public String helloLogback() {
        logger.trace("this is a trace log");
        logger.debug("this is a debug log");
        logger.info("this is an info log");
        logger.warn("this is a warn log");
        logger.error("this is an error log");
        return "hello logback";
    }
}
