package study.querydsl.controller;

import org.springframework.boot.jackson.JsonComponent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    private String hello(){
        return "hello";
    }
}
