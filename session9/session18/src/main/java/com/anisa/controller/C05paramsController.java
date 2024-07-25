package com.anisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/") //path match
public class C05paramsController {

    @GetMapping(value = "testParam/{id}", params = "myParam", headers = "user-agent")
    public String testParam(@PathVariable(value = "id") String id, String userAgent) {
        return "product";
    }
}
