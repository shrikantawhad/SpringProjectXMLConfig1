package com.ncs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncs.beans.Student;

public class Main {
	public static void main(String[] args) {
		String config_loc = "/com/ncs/resources/applicationContxt.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc); // It'll invoke spring container
		
		Student std1 = (Student) context.getBean("stdId1");
		std1.display();
		
		System.out.println("\n******************************\n");
		
		Student std2 = (Student) context.getBean("stdId2");
		std2.display();
	}

}
