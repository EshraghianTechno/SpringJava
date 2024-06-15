package com.anisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class C07nameDiscoveryController {

    @GetMapping("/mm")
    public String m(/*@RequestParam("")*/ String name) {
        System.out.println(name);
        return "product";
    }
}
