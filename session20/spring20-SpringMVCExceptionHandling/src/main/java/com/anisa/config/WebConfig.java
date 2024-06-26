package com.anisa.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.util.UrlPathHelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Properties;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.anisa"})
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
    }

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        UrlPathHelper urlPathHelper = new UrlPathHelper();
        urlPathHelper.setRemoveSemicolonContent(false);
        configurer.setUrlPathHelper(urlPathHelper);
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

        //converters.add(new StringHttpMessageConverter());
        //converters.add(new Jaxb2RootElementHttpMessageConverter());
        converters.add(new MappingJackson2HttpMessageConverter());
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //  registry.addInterceptor(new MyInterceptor());
        registry.addInterceptor(new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

                if (request.getParameter("param") != null) {
                    throw new Exception("");
                }
                return true;
            }
        });
    }

//    @Bean
//    public HandlerExceptionResolver handlerExceptionResolver() {
//        return new HandlerExceptionResolver() {
//            @Override
//            public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
//
//                ModelAndView modelAndView = new ModelAndView();
//                modelAndView.setViewName("error-page");
//                modelAndView.addObject("exceptionType", ex);
//                return modelAndView;
//            }
//        };
//    }

//    @Bean
//    public HandlerExceptionResolver handlerExceptionResolver() {
//        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
//
//        //mapping based on error
//        Properties mapping = new Properties();
//        mapping.put("java.lang.ArithmeticException", "error1");
//        mapping.put("java.lang.NullPointerException", "error2");
//        //mapping base on statusCode
//        Properties statusCodes = new Properties();
//        statusCodes.put("error-page", "400");
//        statusCodes.put("NullPointerExceptionPage", "404");
//
//
//        resolver.setStatusCodes(statusCodes);
//        resolver.setExceptionMappings(mapping);
//        resolver.setDefaultErrorView("default-error-page");
//        return resolver;
//    }

}
