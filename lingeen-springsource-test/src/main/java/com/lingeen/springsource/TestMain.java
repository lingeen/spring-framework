package com.lingeen.springsource;

import com.lingeen.springsource.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext
				= new ClassPathXmlApplicationContext("beans.xml");

		Person bean = classPathXmlApplicationContext.getBean(Person.class);
		System.out.println(bean);
	}
}
