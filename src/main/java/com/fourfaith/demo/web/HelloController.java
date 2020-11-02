package com.fourfaith.demo.web;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Ethan Wong
 * @Date: 2020-10-31 14:31:10
 * @FilePath: \src\main\java\com\fourfaith\demo\web\HelloController.java
 * @LastEditTime: 2020-11-02 15:00:27
 * @LastEditors: your name
 */
@RestController()
@RequestMapping("/hello")
public class HelloController {

    @GetMapping(value = "/{name}")
    public String world(@PathVariable final String name) {
        System.out.println("name=" + name);
        return name;
    }

    @GetMapping(value = "/name")
    public String param(@PathParam("name") final String name) {
        System.out.println("the name is " + name);

        return name;
    }

}