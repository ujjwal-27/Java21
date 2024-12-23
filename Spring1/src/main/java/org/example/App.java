package org.example;

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
        // Creates container, and helps to get object from the container
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // By default, getBean provides an object. Here, we're typecasting the object to Alien.
        Alien alien = (Alien) context.getBean("alien");
        alien.code();
    }
}
