package com.yale.bamboo.web;

import com.yale.bamboo.service.H2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("h2")
public class H2Controller {
    @Autowired
    private H2Service service;

    @RequestMapping("/test")
    public String jpaTest() {

        return service.findAll().toString();
    }
}