package com.anisa.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/")
public class C04RequestHeaderController {

    @GetMapping("/h1")
    public String header1(@RequestHeader("User-Agent") String userAgent, Model model) {
        System.out.println("userAgent is " + userAgent);
        return "home";
    }

    @GetMapping("/h2")
    public String header2(@RequestHeader String accept, Model model) {
        System.out.println("accept is " + accept);
        return "home";
    }

    @GetMapping("/h3")
    public String header3(@RequestHeader Map<String, String> headers, Model model) {
        model.addAttribute("headers", headers);
        System.out.println("headers is " + headers);
        return "home";
    }

    @GetMapping("/h4")
    public String header4(@RequestHeader HttpHeaders headers, Model model) {
        model.addAttribute("headers", headers);
        System.out.println("headers is " + headers);
        return "home";
    }

    @GetMapping("/h5")
    public String header5(@RequestHeader(value = "Last-Modified", required = false) Date last, Model model) {
        model.addAttribute("headers", last);
        System.out.println(last);
        return "home";
    }
}
