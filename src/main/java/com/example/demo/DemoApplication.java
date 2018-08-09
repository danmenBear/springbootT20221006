package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;

@SpringBootApplication(exclude = ValidationAutoConfiguration.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	//第二种启动方式  在当前文件夹的dos窗口上,mvn spring-boot:run

	//第三种启动方式  在target 文件夹中找到 jar文件用java启动,推荐在linux中配合ll运行
	//举例java -jar girl-0.0.1-SNAPSHOT.jar
}
