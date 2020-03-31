package com.yikai.crossorign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Tips
 * @Author yikai.wang
 * @Date 2020/3/31 9:45
 */
@Controller
public class HelloController {

    @RequestMapping("index")
    public String index() {
        return "index";
    }

    @PostMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
