package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Class.MyObject;

public class Main {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyObject obj1 = (MyObject) context.getBean("Lettre1");
		MyObject obj2 = (MyObject) context.getBean("Lettre2");
		System.out.println(obj1.getName());
		System.out.println(obj1.getId());
		System.out.println();
		System.out.println(obj2.getName());
		System.out.println(obj2.getId());
		System.out.println();
		System.out.println(obj2.getParent().getName());
	}
}
