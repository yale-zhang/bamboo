package com.yale.bamboo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cat")
public class Cat {
    /**
     * 默认路由方法
     * @return
     */
    @RequestMapping("")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("/index");//设置对应jsp的模板文件
        modelAndView.addObject("hi","hello,cat");//设置${hi}标签的值为hello，cat
        return modelAndView;
    }
}
