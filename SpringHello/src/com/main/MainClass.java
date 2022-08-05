package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		Student s1=(Student)a.getBean("s1");
		System.out.println("ID: "+s1.getId());
		System.out.println("Fname: "+s1.getFname());
		System.out.println("Lname: "+s1.getLname());
		System.out.println("Email: "+s1.getEmail());
		
		AbstractApplicationContext a1=new ClassPathXmlApplicationContext("Beans.xml");
		Student s2=(Student)a1.getBean("s1");
		System.out.println("ID: "+s2.getId());
		System.out.println("Fname: "+s2.getFname());
		System.out.println("Lname: "+s2.getLname());
		System.out.println("Email: "+s2.getEmail());
		a1.registerShutdownHook();
	}
}
