package com.anisa.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.ConcurrentHashMap;

@ControllerAdvice//global
//@SessionScope
//@RequestScope
//1-@ExceptionHandler
// 2- @InitBinder
// 3-@ModelAttribute
public class PageCounterControllerAdvice {

    private ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();


    @ModelAttribute
    public void handleRequest(HttpServletRequest request, Model model) {
        String requestURI = request.getRequestURI();
//        map.computeIfAbsent(requestURI, s -> new LongAdder()).increment();
        Integer counter = 0;
        if (map.get(requestURI) == null) {
            map.put(requestURI, 1);
        } else {
            counter = map.get(requestURI);
            counter++;
            map.put(requestURI, counter);
        }
//        model.addAttribute("counter", map.get(requestURI).sum());
        model.addAttribute("counter", counter);
        model.addAttribute("uri", requestURI);
    }
}
