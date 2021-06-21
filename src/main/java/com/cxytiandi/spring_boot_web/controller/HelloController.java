package com.cxytiandi.spring_boot_web.controller;

import com.cxytiandi.spring_boot_web.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jason
 */
@RestController
public class HelloController {

    /**注入对象**/
    @Autowired
    private Environment env;

    /**注入配置**/
    @Value("${server.port}")
    private String port;

    @Autowired
    private MyConfig myConfig;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello2")
    public String hello2() {
        String port = env.getProperty("server.port");
        return port;
    }

    @GetMapping("/hello3")
    public String hello3() {
        return port;
    }

    @GetMapping("/hello4")
    public String hello4() {
        return myConfig.getName();
    }
}
