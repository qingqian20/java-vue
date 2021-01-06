package com.qingao.vue1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages="com.qingao.vue1")
@MapperScan(basePackages="com.qingao.vue1.dao")
public class App 
{
  public static void main(String[] args) throws Exception {
	SpringApplication.run(App.class, args);
}

}
