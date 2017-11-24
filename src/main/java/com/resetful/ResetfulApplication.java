package com.resetful;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//配置MAPPER接口类未知
@MapperScan("com.resetful.mapper")
public class ResetfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResetfulApplication.class, args);
	}
}
