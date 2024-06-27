package com.anisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class C01ControllerResolver2 {

    @GetMapping("/copyOne")
    public void one() {
        throw new ArithmeticException("arithmetic error");
//        throw new NullPointerException("khali bood");
    }
}

