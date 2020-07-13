package com.tomcat.demo.tomcatdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tomcat")
public class TomcatController {

    @GetMapping("/hello")
    public String sayHello () {
        return "Hello from tomcat";
    }
}
