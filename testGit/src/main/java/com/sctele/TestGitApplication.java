package com.sctele;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestGitApplication {

	public static void main(String[] args) {
		System.out.println("这是分支的代码");
		SpringApplication.run(TestGitApplication.class, args);
	}
}
