package com.yunfei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot 程序入口
 * @author 贤名
 * @qq 799078779
 */
@SpringBootApplication
@MapperScan("com.yunfei.mapper")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
