package com.sctele;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestGitApplication {

	public static void main(String[] args) {
		System.out.println("这是分支的代码");
		System.out.println("这是分支01的代码");
		System.out.println("这是分支02的代码");
		SpringApplication.run(TestGitApplication.class, args);
	}

	private void test() {
		System.out.println("test");
	}

	public void master() {
		System.out.println("master");
	}

	public void branch() {
		System.out.println("branch");
	}

	public void branch02() {
		System.out.println("branch02");
	}

	public void branch04() {
		System.out.println("branch04");
	}

}
