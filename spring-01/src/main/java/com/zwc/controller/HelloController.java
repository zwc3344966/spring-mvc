package com.zwc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author: zhangwch
 * @create: 2020-05-21 21:31
 **/

@Controller
// @RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用
// @RestController
public class HelloController {


    @RequestMapping("/hello")
//    @PostMapping("/hello") // 只能已POST方式提交
//    @GetMapping("/hello") // 只能以GET方式提交
//    @ResponseBody // 返回json数据
    public String handleRequest() {
        System.out.println("httpServletRequest = [==============]");
        return "hello";
    }
}
