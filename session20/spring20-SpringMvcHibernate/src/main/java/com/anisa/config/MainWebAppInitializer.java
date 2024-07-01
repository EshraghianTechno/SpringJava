package com.anisa.config;

import org.h2.server.web.WebServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MainWebAppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
        root.scan("com.anisa");
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(root));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
        ServletRegistration.Dynamic servlet = servletContext.addServlet("h2-console", new WebServlet());
        servlet.setLoadOnStartup(2);
        servlet.addMapping("/console/*");
    }

}
