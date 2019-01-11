package com.rocky.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@SpringBootApplication
@ComponentScan("com.rocky.springbootdemo")
//@EnableConfigurationProperties(ConfigBean.class)
@EnableConfigurationProperties(ConfigBean.class)
public class SpringbootdemoApplication {

	@Autowired
//	private ConfigBean configBean;
	private ConfigBean testConfigBean;
	@Value("${com.rocky.name}")
	private String name;

	@Value("${com.rocky.age}")
	private Integer age;

	@RequestMapping(value = "/test")
	public String index(){
//		return "姓名："+name+" ,年龄："+age;
//		return  "姓名："+configBean.getName()+" ,年龄："+configBean.getAge();

		return  "姓名："+testConfigBean.getName()+" ,年龄："+testConfigBean.getAge();
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
}
