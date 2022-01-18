package org.linesquall.dubboexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private String port = "8080";

    @RequestMapping("/hello")
    public String hello() {
        return "hello consul from " + this.port;
    }
}