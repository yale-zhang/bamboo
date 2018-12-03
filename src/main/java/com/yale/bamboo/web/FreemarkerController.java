package com.yale.bamboo.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@RestController
@RequestMapping(value = "/freemarker")
public class FreemarkerController {
    /**
     * 日志管理
     * @Title: toDemo
     * @Description: 跳转freemarker页面
     * @param mv
     * @return
     */
     @RequestMapping(value = "/toDemo")
     public ModelAndView toDemo(ModelAndView mv) {
         log.info("====>>跳转freemarker页面"); mv.addObject("name", "jack");
         mv.setViewName("freemarker");
         return mv;
     }

}
