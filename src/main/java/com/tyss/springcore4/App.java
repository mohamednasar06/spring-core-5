package com.tyss.springcore4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
          Student c=(Student) context.getBean("student");
          System.out.println(c.name);
    }
}
