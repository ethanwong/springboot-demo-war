package com.imethan.demo.configuration;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @Description: 
 * @Author: Ethan Wong
 * @Date: 2020-10-31 13:57:27
 * @FilePath: \src\main\java\com\imethan\demo\configuration\WarDemoApplication.java
 * @LastEditTime: 2020-11-02 17:33:46
 * @LastEditors: your name
 */
@SpringBootApplication(scanBasePackages = {"com.fourfaith"})
public class WarDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarDemoApplication.class, args);
	}

}
