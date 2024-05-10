package com.anisa.controller;

import com.anisa.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class C01HomeController {

    @GetMapping("/a")
    public String showHomePage() {
        //model
        //calling service
        return "home";
    }

    @GetMapping("/a2")
    public ModelAndView m1() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("name", "mahsa");
        return modelAndView;
    }

    @GetMapping("/a3")
    public String m2(HttpServletRequest request, ModelMap model) {
        String myname = request.getParameter("myname");
        model.addAttribute("myname", myname);
        return "home";
    }

    @GetMapping("/list")
    public ModelAndView sendList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("listOfProduct");
        List<Product> products = new ArrayList<>();
        products.add(new Product(1l, "iphone"));
        products.add(new Product(1l, "ipad"));
        products.add(new Product(1l, "mac"));
        modelAndView.addObject("products", products);
        return modelAndView;
    }

    @GetMapping("showForm")
    public String showForm() {
        return "createProduct";
    }

    @PostMapping("/createProduct")
    public ModelAndView createProduct(@ModelAttribute("product") Product product) {
        System.out.println(product.getName());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("name", product.getName());
        return modelAndView;
    }
}
