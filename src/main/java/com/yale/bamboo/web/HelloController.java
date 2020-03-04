package com.yale.bamboo.web;

import com.yale.bamboo.common.handler.MyException;
import com.yale.bamboo.domain.dto.UserDto;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }

    @RequestMapping("/user")
    public UserDto user(@RequestBody UserDto userDto) throws Exception {
        return userDto;
    }

}