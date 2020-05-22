package com.zwc.controller;

import com.zwc.common.Msg;
import com.zwc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author: zhangwch
 * @create: 2020-05-21 21:31
 @RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用
 @RestController
 */
@Controller
@RequestMapping("/user")
public class HelloController {

    /**
     * @PostMapping("/hello") // 只能已POST方式提交
     * @GetMapping("/hello") // 只能以GET方式提交
     * @ResponseBody // 返回json数据*/
    @RequestMapping("/hello")
    public String handleRequest() {
        System.out.println("httpServletRequest = [==============]");
        return "hello";
    }


    /**
     * 在方法中通过字段名匹配并获取上送的参数
     */
    @RequestMapping("/hello1")
    public String hello1(String name, String age) {
        System.out.println("name = [" + name + "], age = [" + age + "]");
        return "hello1";
    }

    /**
     * 请求URL中参数跟方法名参数不匹配时，使用@PathVariable("")进行转换，这样可以隐藏内部参数更安全
     */
    @RequestMapping("/hello2/{username}/{id}")
    public String hello2(@PathVariable("username") String name, @PathVariable("id")String userid) {
        System.out.println("name = [" + name + "], id = [" + userid + "]");
        return "hello2";
    }

    /**
     * 使用对象获取上送的参数(需要先定义一个对象，如：User，上送的字段会去匹配对象中的字段，如果一致就可以获取到参数值)
     */
    @RequestMapping("/hello3")
    public String hello3(User user) {
        System.out.println("user = [" + user.toString() + "]");
        return "hello3";
    }

    /*使用对象解析上送的json数据*/
    @RequestMapping(value = "/getUserInfo", method = RequestMethod.POST)
    public @ResponseBody Msg hello4(@RequestBody User user) {
        System.out.println("user = [" + user.toString() + "]");
        return Msg.success().add("user", user);
    }

    /*如果前端上送的字段跟后台接收的字段名不一致，可以使用@RequestParam注解可以转换字段名称*/
    @RequestMapping(value = "/hello5")
    public @ResponseBody Msg hello5(@RequestParam(value = "username") String name, String id) {
        System.out.println("name = [" + name + "], id = [" + id + "]");
        return Msg.success().add("user", name);
    }

    @RequestMapping("/j1")
    @ResponseBody
    public String json1() {
        User user = new User("1", "zwc", "25");
        return user.toString();
    }
}
