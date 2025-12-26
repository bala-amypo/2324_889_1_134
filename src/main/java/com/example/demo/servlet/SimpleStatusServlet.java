package com.example.demo.servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Configuration
public class SimpleStatusServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/plain");
        resp.getWriter().write("OK");
    }

    @Bean
    public ServletRegistrationBean<SimpleStatusServlet> statusServletRegistration() {
        ServletRegistrationBean<SimpleStatusServlet> registration = new ServletRegistrationBean<>(new SimpleStatusServlet());
        registration.addUrlMappings("/status");
        return registration;
    }
}