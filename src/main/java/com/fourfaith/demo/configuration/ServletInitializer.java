package com.fourfaith.demo.configuration;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * @Description: 
 * @Author: Ethan Wong
 * @Date: 2020-10-31 13:57:27
 * @FilePath: \src\main\java\com\fourfaith\demo\configuration\ServletInitializer.java
 * @LastEditTime: 2020-11-02 16:33:35
 * @LastEditors: your name
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WarDemoApplication.class);
	}

}
