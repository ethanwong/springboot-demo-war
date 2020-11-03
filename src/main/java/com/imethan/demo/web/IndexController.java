package com.imethan.demo.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 
 * @Author: Ethan Wong
 * @Date: 2020-10-31 13:58:24
 * @FilePath: \src\main\java\com\imethan\demo\web\IndexController.java
 * @LastEditTime: 2020-11-02 17:34:03
 * @LastEditors: your name
 */
@Controller
public class IndexController{

    /**
     * @param name
     * @return
     */
    @GetMapping("/index")
    @ResponseBody
    public Map<String, String> index(final String name) {
        final Map<String, String> map = new HashMap<String, String>(10);
        map.put("name", "springboot");
        map.put("content", "This is a springboot demo !");
        map.put("date", String.valueOf(System.currentTimeMillis()));
        
        return map;
    }

    /**
     * @param model
     * @return
     */
    @GetMapping("/home")
    public String home(Model model){

        model.addAttribute("content", "welcome home !");
        System.out.println("home");
        return "home";
    }

    @GetMapping("")
    public String welcome(){
        return "redirect:home";
    }

}