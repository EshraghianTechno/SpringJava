package com.anisa.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class C03GlobalExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    public String NullPointerException(NullPointerException exception, Model model) {
        model.addAttribute("exception", exception);
        return "error3";
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String exception(Exception exception) {
        return "Exception generated in controller :" + exception;
    }

}

