package com.yale.bamboo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BambooApplication {
	/**
	 * 重写configure方法，加载启动类
	 * @param builder
	 * @return
	 */
/*	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BambooApplication.class);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(BambooApplication.class, args);
	}
}
