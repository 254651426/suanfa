package com.yangjie.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yangjie.service.StudentService;
import com.yangjie.service.UserService;

public class Test extends Thread {

	@Override
	public void run() {
		final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-*.xml");
		context.start();
		// StudentService user = (StudentService)
		// context.getBean(StudentService.class);
		// user.add();
		UserService user = (UserService) context.getBean(UserService.class);
		String username = user.getUser("Mark");
		System.out.println("username" + username);

	}

	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			new Test().start();
		}
	}
}
