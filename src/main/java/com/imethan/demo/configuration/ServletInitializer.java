package com.imethan.demo.configuration;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * @Description: 
 * @Author: Ethan Wong
 * @Date: 2020-10-31 13:57:27
 * @FilePath: \src\main\java\com\imethan\demo\configuration\ServletInitializer.java
 * @LastEditTime: 2020-11-02 17:33:34
 * @LastEditors: your name
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WarDemoApplication.class);
	}

}
