package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Emp;
import com.bean.Student;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		Student s1=(Student) a.getBean("s1");
		
		s1.setFname("Ankush");
		s1.setLname("Rajput");
		s1.setEmail("ankush@gmail.com");
		System.out.println(s1);
		
		Student s2=(Student) a.getBean("s1");
		System.out.println(s2);
		
		System.out.println("---------Prototype Example----------");
		Emp e1=(Emp) a.getBean("e1");
		
		e1.setEname("Ankush");
		e1.setJob("Java Developer");
		e1.setEmail("ankush@gmail.com");
		System.out.println(e1);
		
		Emp e2=(Emp) a.getBean("e1");
		System.out.println(e2);
	}
}
