package com.example.demo;

import com.example.demo.beans.BraveKnight;
import com.example.demo.beans.Knight;
import com.example.demo.beans.SlayDragonQuest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication(scanBasePackages = "com.example.demo.beans")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo-beans.xml");

        Knight knight = (Knight) context.getBean("braveKnight");
        knight.embarkOnQuest();
	}

}
